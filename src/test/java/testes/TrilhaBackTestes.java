package testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.enums.TypeEnum;
import trilha.back.financys.exception.DivideByZeroException;
import trilha.back.financys.exception.ParameterNotFound;
import trilha.back.financys.exception.WrongParameter;
import trilha.back.financys.repository.EntryRepository;
import trilha.back.financys.services.EntryService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class TrilhaBackTestes {

    @Mock
    private EntryRepository entryRepository;

    @InjectMocks
    private EntryService entryService;

    @Before
    public void setUp(){
        //1 - Mocka as dependencias
        List<Entry> listEntry = new ArrayList<>();
        Entry entry1 = new Entry(
                1l,
                "nome",
                "descricao",
                TypeEnum.revenue,
                30.0,
                "data",
                true,
//                "nome");
                new Category(1l, "nome", "descricao"));
        listEntry.add(entry1);
        when(entryRepository.findAll()).thenReturn(listEntry);
    }

    @Test
    public void filtrosOk(){
        //2- Chamar o metodo que vai ser testado, se tiver parametros, passar os parametros
        List<Entry> listRetorno = entryService.getLancamentosDependentes("data", "30.0", true);

        //3- Testar o se o resultado é o resultado esperado
        Assert.assertEquals(1, listRetorno.size());
    }

    @Test
    public void testeParametrosNull(){
        //2- Chamar o metodo que vai ser testado, se tiver parametros, passar os parametros
        Throwable exception = Assert.assertThrows(WrongParameter.class, () -> {
            entryService.getLancamentosDependentes(null, null, null);
        });

        //3- Testar o se o resultado é o resultado esperado
        Assert.assertEquals("Parâmetros com valores errados", exception.getMessage());
        exception.printStackTrace();
    }

    @Test
    public void testeParametrosDiferentes(){
        //2- Chamar o metodo que vai ser testado, se tiver parametros, passar os parametros
        Throwable exception = Assert.assertThrows(ParameterNotFound.class, () -> {
            entryService.getLancamentosDependentes("12324", "50.6",true);
        });
        //3- Testar o se o resultado é o resultado esperado
        Assert.assertEquals("Não existe os dados pelo parâmetro passado", exception.getMessage());
        exception.printStackTrace();
    }

    @Test
    public void testeCalculo(){
        int result = entryService.calculaMedia(10,2);
        Assert.assertEquals(5, result);
    }

    @Test
    public void teste2(){
        Throwable exception = Assert.assertThrows(DivideByZeroException.class, () -> {
            entryService.calculaMedia(0,5);
        });
        //3- Testar o se o resultado é o resultado esperado
        Assert.assertEquals("Não pode dividir por 0!", exception.getMessage());
        exception.printStackTrace();
    }
}




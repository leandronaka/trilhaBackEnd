package trilha.back.financys.enums;

public enum TypeEnum {

    revenue("revenue"),
    expense("expense");

    private String typeEnum;

    private TypeEnum(String typeEnum) {
        this.typeEnum = typeEnum;
    }

    public String getTypeEnum() {
        return typeEnum;
    }
}

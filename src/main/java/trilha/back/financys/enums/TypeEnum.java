package trilha.back.financys.enums;

public enum TypeEnum {

    REVENUE("revenue"),
    EXPENSE("expense");

    private String typeEnum;

    private TypeEnum(String typeEnum) {
        this.typeEnum = typeEnum;
    }

    public String getTypeEnum() {
        return typeEnum;
    }
}

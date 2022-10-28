public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "“Brazilian Rosewood";
            case MAHOGANY:
                return "mahogany";
            case MAPLE:
                return "maple";
            case COCOBOLO:
                return "cocobolo";
            case CEDAR:
                return "cedar";
            case ADIRONDACK:
                return "adirondack";
            case ALDER:
                return "alder";
            case SITKA:
                return "sitka";

        }
        return null;
    }
}

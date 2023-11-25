package modelos;

public class ModeloEstatistica {

    int countLogInsert;
    int countLogUpdate;
    int countLogDelete;

    public ModeloEstatistica() {

    }

    public ModeloEstatistica(int countLogInsert, int countLogUpdate, int countLogDelete) {
        this.countLogInsert = countLogInsert;
        this.countLogUpdate = countLogUpdate;
        this.countLogDelete = countLogDelete;
    }

    public int getCountLogInsert() {
        return this.countLogInsert;
    }
    public void setCountLogInsert(int countLogInsert) {
        this.countLogInsert = countLogInsert;
    }

    public int getCountLogUpdate() {
        return this.countLogUpdate;
    }
    public void setCountLogUpdate(int countLogUpdate) {
        this.countLogUpdate = countLogUpdate;
    }

    public int getCountLogDelete() {
        return this.countLogDelete;
    }
    public void setCountLogDelete(int countLogDelete) {
        this.countLogDelete = countLogDelete;
    }
}

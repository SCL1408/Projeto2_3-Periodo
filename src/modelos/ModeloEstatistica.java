package modelos;

public class ModeloEstatistica {

    int countLogInsert;
    int countLogUpdate;
    int countLogDelete;
    int countAlunos;
    int countProfessores;

    public ModeloEstatistica() {

    }

    public ModeloEstatistica(int countLogInsert, int countLogUpdate, int countLogDelete, int countAlunos, int countProfessores) {
        this.countLogInsert = countLogInsert;
        this.countLogUpdate = countLogUpdate;
        this.countLogDelete = countLogDelete;
        this.countAlunos = countAlunos;
        this.countProfessores = countProfessores;
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

    public int getCountAlunos() {
        return this.countAlunos;
    }
    public void setCountAlunos(int countAlunos) {
        this.countAlunos = countAlunos;
    }

    public int getCountProfessores() {
        return this.countProfessores;
    }
    public void setCountProfessores(int countProfessores) {
        this.countProfessores = countProfessores;
    }
}

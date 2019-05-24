package Model;


public class WorkerUnit extends Unit {
    private int workSkill;
    private String WORKER_CLASS = "Worker";

    public WorkerUnit(int workSkill, double health, double movementSpeed){
        super(health, movementSpeed);
        setWorkSkill(workSkill);
    }
    public int getWorkSkill() {
        return workSkill;
    }

    public void setWorkSkill(int workSkill) {
        this.workSkill = workSkill;
    }

    public String getWORKER_CLASS() {
        return WORKER_CLASS;
    }

    @Override
    public String toString() {
        return getWORKER_CLASS()+ " Skill: "+getWorkSkill()+" " +super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WorkerUnit that = (WorkerUnit) o;
        return workSkill == that.workSkill;
    }

}

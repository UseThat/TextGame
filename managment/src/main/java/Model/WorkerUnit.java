package Model;

import java.util.Objects;

public class WorkerUnit extends Unit {
    private int workSkill;


    public int getWorkSkill() {
        return workSkill;
    }

    public void setWorkSkill(int workSkill) {
        this.workSkill = workSkill;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WorkerUnit that = (WorkerUnit) o;
        return workSkill == that.workSkill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workSkill);
    }
}

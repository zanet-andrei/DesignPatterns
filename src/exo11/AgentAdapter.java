package exo11;

public class AgentAdapter implements OldAgent {

    private Agent agent;

    public AgentAdapter(Agent agent) {
        this.agent = agent;
    }

    @Override
    public void miseEnVeille() {
        agent.pause();
    }

    @Override
    public void procedureInitialisation() {
        agent.initialisation();
    }

    @Override
    public void procedureMaintenance() {
        agent.maintenance();
    }

    @Override
    public void procedureSauvegarde() {
        agent.sauvegarde();
    }
}

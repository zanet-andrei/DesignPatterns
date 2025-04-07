package exo11;

public class Service {

    private Agent agent;
    private AgentAdapter agentAdapter;

    public Service(Agent agent) {
        this.agent = agent;
        agentAdapter = new AgentAdapter(agent);
    }

    public void ancienneFonction() {
        agentAdapter.procedureInitialisation();
        agentAdapter.procedureMaintenance();
        agentAdapter.procedureSauvegarde();
        agentAdapter.miseEnVeille();
        // Les fonctions font appel au nouvel objet Agent
        // tout en utilisant la nomenclature de OldAgent
    }
}

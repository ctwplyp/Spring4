package main.java;
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest =quest;
    }

    public void embarkOnQuest(){
        quest.embark();

    }

   /* public static void main(String[] args) {
        BraveKnight bk = new BraveKnight(new main.java.DamselRescueQuest());
        bk.embarkOnQuest();
    }*/
}

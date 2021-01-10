
public class CardRunner
{
    public static void main(String[] args)
    {
        RewardsCard card1 = new RewardsCard("Dennis Bonsall");
        RewardsCard card2 = new RewardsCard("Juan Flores");
        RewardsCard card3 = new RewardsCard("Jose Villapando");
        
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        
        card1.getTransactions().addTransaction(50.00,0,"09/28/16");
        card1.setTransactions(card1.getTransactions().getPointsEarned(),card1.getTransactions().getPointsUsed(),card1.getTransactions().toString()); 
        card1.getTransactions().addTransaction(36.24, 0, "09/30/16");
        card1.setTransactions(card1.getTransactions().getPointsEarned(),card1.getTransactions().getPointsUsed(),card1.getTransactions().toString());
        card1.getTransactions().addTransaction(76.25, 0, "10/04/16");
        card1.setTransactions(card1.getTransactions().getPointsEarned(),card1.getTransactions().getPointsUsed(),card1.getTransactions().toString());
        card1.getTransactions().addTransaction(90.00, 10, "10/12/16");
        card1.setTransactions(card1.getTransactions().getPointsEarned(),card1.getTransactions().getPointsUsed(),card1.getTransactions().toString());
        
        System.out.println(card1);
        System.out.println(card2);
    }
}
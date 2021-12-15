package composition;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Dow");
        System.out.println(trainer.getAddress());

        trainer.setAddress(new Address("Budapest","Kiráylok útja"));
        System.out.println(trainer.getAddress().getCity());
    }
}

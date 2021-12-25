public class Email extends NotifierDecorator{

    public Email(Notifier notifier){
        super(notifier);
    }

    @Override
    public int getMethodTotal() {
        return 100;
    }

    @Override
    public String getMethodName() {
        return "E-mail";
    }



}

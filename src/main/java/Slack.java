public class Slack extends NotifierDecorator{

    public Slack(Notifier notifier){
        super(notifier);
    }

    @Override
    public int getMethodTotal() {
        return 150;
    }

    @Override
    public String getMethodName() {
        return "Slack";
    }
}

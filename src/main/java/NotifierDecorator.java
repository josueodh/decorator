public abstract class NotifierDecorator implements Notifier{

    private Notifier notifier;
    public String method;

    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    public Notifier getNotifier(){
        return notifier;
    }

    public void setNotifier(Notifier notifier){
        this.notifier = notifier;
    }

    public abstract int getMethodTotal();

    public int getTotal() {
        return this.notifier.getTotal() + this.getMethodTotal();
    }

    public abstract String getMethodName();

    public String getMethod() {
        return this.notifier.getMethod() + "/" + this.getMethodName();
    }

    public void setMethod(String method){
        this.method = method;
    }
}

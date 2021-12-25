public class DefaultNotifier implements Notifier{

    public int total;

    public DefaultNotifier(){};

    public DefaultNotifier(int total){
        this.total = total;
    }
    @Override
    public int getTotal() {
        return this.total;
    }

    @Override
    public String getMethod() {
        return "Default";
    }
}

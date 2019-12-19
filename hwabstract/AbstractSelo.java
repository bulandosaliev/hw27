package hwabstract;

public class AbstractSelo extends AbstractNaselennyipunkt {

    public AbstractSelo(int naselenie, String rukovoditel,String name) {
        super(naselenie, rukovoditel, name);
    }
    @Override
    public void rukovoditel(){
        System.out.println(getRukovoditel());
        System.out.println(getName());
    }
}

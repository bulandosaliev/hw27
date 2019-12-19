package hwabstract;

public class AbstractCity extends AbstractNaselennyipunkt {

    public AbstractCity(int naselenie, String rukovoditel,String name) {
        super(naselenie, rukovoditel,name);
    }
    @Override
    public void rukovoditel(){
        System.out.println(getRukovoditel());
        System.out.println(getName());
    }
}

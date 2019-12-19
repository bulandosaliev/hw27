package hwabstract;

import org.w3c.dom.ls.LSOutput;

public class AbstractNaselennyipunkt {
    private int naselenie;
    private String rukovoditel;
    private String name;

    public AbstractNaselennyipunkt(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public AbstractNaselennyipunkt(int naselenie, String rukovoditel,String name) {
        this.naselenie = naselenie;
        this.rukovoditel = rukovoditel;
        this.name = name;
    }

    public int getNaselenie() {
        return naselenie;
    }

    public void setNaselenie(int naselenie) {
        this.naselenie = naselenie;
    }

    public String getRukovoditel() {
        return rukovoditel;
    }

    public void setRukovoditel(String rukovoditel) {
        this.rukovoditel = rukovoditel;
    }
    public void setName(String rukovoditel) {
        this.rukovoditel = rukovoditel;
    }
    public void rukovoditel(){
        System.out.println(getRukovoditel());
        System.out.println(getName());
    }
}

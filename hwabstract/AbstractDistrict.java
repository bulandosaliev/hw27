package hwabstract;

public class AbstractDistrict extends AbstractNaselennyipunkt {
    public static AbstractDistrict[] districts = new AbstractDistrict[4];
    public AbstractDistrict(int naselenie, String rukovoditel, String name) {
        super(naselenie, rukovoditel, name);

        districts[0] = new AbstractDistrict(5005, "Azat Djanybekov", "1-mkr");
        districts[1] = new AbstractDistrict(4000, "Djanhay Muhammed", "2-mkr");
        districts[2] = new AbstractDistrict(3000, "Dosaliev Bulan", "3 mkr");
        districts[3] = new AbstractDistrict(5400, "Dastan Salavat", "4 mkr");

        for (int i = 0; i < 4; i++) {
            System.out.println(getRukovoditel());
            System.out.println(districts[i].getName());


        }
    }
}


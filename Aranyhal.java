package main.java_dolgozat_20230227;

import java.util.ArrayList;
import java.util.Map;

public class Aranyhal {
    private final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private Map<String, ArrayList<Integer>> kivansagok;
    private String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta) {
        return 0;
    }
    
    public String[] kikkelTalalkozott() {
        return new String[1];
    }
    
    public boolean kivansagotTeljesit(String kivansag) {
        return true;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "KIVANSAGOKSZAMA=" + KIVANSAGOKSZAMA + ", kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
}
import org.apache.commons.lang3.StringUtils;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(name.length()>= 3 && name.length()<=19 && name.equals(name.trim()) && StringUtils.countMatches(name, " ") == 1){
            return true;
        } else{
            return false;
        }
    }
}
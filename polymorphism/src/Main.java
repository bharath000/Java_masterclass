
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "no plot here";

    }
}
class Jaws extends Movie{
    public Jaws(){
        super("jaws");
    }
    public String plot(){
        return "classic movie";
    }
}
class ind extends Movie{
    public ind(){
        super("ind");
    }
    public String plot(){
        return "aliens take over";
    }
}
class mazerunner extends Movie{
    public mazerunner(){
        super("mazerunner");
    }
    public String plot(){
        return "maze ruuning puzzle solving movie";
    }
}

class starwars extends Movie{
    public starwars(){
        super("starwars");
    }
    public String plot(){
        return "future movie/ space evasion";
    }
}

class forgetable extends Movie{
    public forgetable(){
        super("forgatable");
    }
   // no plot
}


public class Main {
    public static void Main(String[] args){

        for(int i= 1;i<11;i++){
            Movie movie = randommovie();
            System.out.println(i+""+movie.plot());
        }

    }

    public static Movie randommovie(){
        int randomnumber = (int) (Math.random()*5)+1;
        System.out.println("randoim number"+randomnumber);
        switch (randomnumber){
            case 1:
                return new Jaws();
            case 2:
                return new ind();
            case 3:
                return new mazerunner();
            case 4:
                return new starwars();
            case 5:
                return new forgetable();

        }
        return null;
    }
}

package inheritance;

public class lab_team {

    public static void team(String[] args) {
    
        researcher Alex = new researcher();

        Alex.name = "Alex";
        Alex.age = 25;
        Alex.degree = "Master's Degree";
        Alex.expertise = new String[]{"Chemistry", "Organic Synthesis"};
        Alex.studies = new String[]{"Supercapacitors", 
                                    "Porous materials", 
                                    "Electrochemistry",
                                    "Kinetic studies"};
        Alex.group = "L1";
        
        researcher Pericle = new researcher();
        Pericle.name = "Pericle";
        Pericle.age = 29;
        Pericle.degree = "PhD";
        Pericle.expertise = new String[]{"Physics", 
                                        "Optoelectronics", 
                                        "Metamaterials and Plasmonics", 
                                        "Data Analysis", 
                                        "3D Printing"};
                    Pericle.studies = new String[]{"Supercapacitors", 
                                    "Porous materials", 
                                    "Electrochemistry",
                                    "Surface plasmons",
                                    "Substrate fabrication",};
        Pericle.group = "L1";

        System.out.println(Alex.expertise);
        System.out.printf("Pericle's domain of expertise covers: %c%n", Pericle.studies.toString());
    }

}

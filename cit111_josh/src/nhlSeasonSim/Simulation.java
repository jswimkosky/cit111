/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhlSeasonSim;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author joshua.swimkosky
 */
public class Simulation {
    // introducing all players as ints into program
    
    // Anaheim Forwards
    int rickardRakell;
    int ryanGetzlaf;
    int ondrejKase;
    // Arizona Forwards
    int philKessel;
    int claytonKeller;
    int nickSchmaltz;
    // Boston Forwards
    int davidPastrnak;
    int patriceBergeron;
    int bradMarchand;
    // Buffalo Forwards
    int jackEichel;
    int jeffSkinner;
    int samReinhart;
    // Calgary Forwards
    int johnnyGaudreau;
    int seanMonahan;
    int matthewTkachuk;
    // CarolinaForwards
    int sebastianAho;
    int andreiSvechnikov;
    int teuvoTeravainen;
    // Chicago Forwards
    int patrickKane;
    int jonathanToews;
    int alexDebrincat;
    // Colorado Forwards
    int nathanMackinnon;
    int mikkoRantanen;
    int gabrielLandeskog;
    // Columbus Forwards
    int pLDubois;
    int camAtkinson;
    // Dallas Forwards
    int tylerSeguin;
    int jamieBenn;
    int alexanderRadulov;
    // Detroit Forwards
    int dylanLarkin;
    int anthonyMantha;
    int tylerBertuzzi;
    // Edmonton Forwards
    int connorMcdavid;
    int leonDraisaitl;
    int ryanNugentHopkins;
    // Florida Forwards
    int aleksanderBarkov;
    int jonathanHuberdeau;
    int evgeniiDadonov;
    // LA Forwards
    int anzeKopitar;
    // Minnesota Forwards
    int jasonZucker;
    int matsZuccarello;
    // Montreal Forwards
    int brendanGallagher;
    int maxDomi;
    int jonathanDrouin;
    // Nashville Forwards
    int filipForsberg;
    int viktorArvidsson;
    int mattDuchene;
    // New Jersey Forwards
    int taylorHall;
    int nicoHischier;
    int jackHughes;
    // New York Islanders Forwards
    int matBarzal;
    int jordanEberle;
    int andersLee;
    // New York Rangers Forwards
    int artemiPanarin;
    int mikaZibanejad;
    int kaapoKakko;
    // Ottawa Forwards
    int bradyTkachuk;
    // Philadelphia Forwards
    int claudeGiroux;
    int travisKonecny;
    int seanCouturier;
    // Pittsburgh Forwards
    int sidneyCrosby;
    int evgeniMalkin;
    int jakeGuentzel;
    // San Jose Forwards
    int evanderKane;
    int loganCouture;
    int tomasHertl;
    // St Louis Forwards
    int vladimirTarasenko;
    int jadenSchwartz;
    int ryanOReilly;
    // Tampa Forwards
    int nikitaKucherov;
    int braydenPoint;
    int stevenStamkos;
    // Toronto Forwards
    int austonMatthews;
    int mitchMarner;
    int johnTavares;
    int williamNylander;
    // Vancouver Forwards
    int boHorvat;
    int eliasPettersson;
    int brockBoeser;
    // Vegas Fs
    int markStone;
    int maxPacioretty;
    int jonathanMarchessault;
     // Washington Fs
    int alexOvechkin;
    int evgenyKuznetsov;
    int nicklasBackstrom;
    // Winnipeg Fs
    int markScheiffele;
    int blakeWheeler;
    int kyleConnor;
    int patrikLaine;
   
    
            
    
    
    
    
    
    
    public static void main(String[] args){
        teamSorter();
       
        
        } // close main
    
    
        
    public static void teamSorter(){
        String statsType;
        String normalTeam;
        Scanner input = new Scanner(System.in);
        System.out.println("Select your stats (normal, advanced)");
        statsType = input.next();
        if (statsType.toLowerCase().equals("normal")) {
            System.out.println("Normal Stats selected.");
            System.out.println("Enter team name (name of team only)");
            System.out.println("No city names and no spaces!");
            normalTeam = input.next();
            switch (normalTeam.toLowerCase()) {
            
                case "ducks":
                    anaheimDucks();
                    break;
                case "coyotes":
                    arizonaCoyotes();
                    break;
                case "bruins":
                    bostonBruins();
                    break;
                case "sabres":
                    buffaloSabres();
                    break;
                case "flames":
                    calgaryFlames();
                    break;
                case "hurricanes":
                    carolinaHurricanes();
                    break;
                case "blackhawks":
                    chicagoBlackhawks();
                    break;
                case "avalanche":
                    coloradoAvalanche();
                    break;
                case "bluejackets":
                    columbusBlueJackets();
                    break;
                case "stars":
                    dallasStars();
                    break;
                case "redwings":
                    detroitRedWings();
                    break;
                case "oilers":
                    edmontonOilers();
                    break;
                case "panthers":
                    floridaPanthers();
                    break;
                case "kings":
                    losAngelesKings();
                    break;
                case "wild":
                    minnesotaWild();
                    break;
                case "canadiens":
                    montrealCanadiens();
                    break;
                case "predators":
                    nashvillePredators();
                    break;
                case "devils":
                    newJerseyDevils();
                    break;
                case "islanders":
                    newYorkIslanders();
                    break;
                case "rangers":
                    newYorkRangers();
                    break;
                case "senators":
                    ottawaSenators();
                    break;
                case "flyers":
                    philadelphiaFlyers();
                    break;
                case "penguins":
                    pittsburghPenguins();
                    break;
                case "sharks":
                    sanJoseSharks();
                    break;
                case "blues":
                    stLouisBlues();
                    break;
                case "lightning":
                    tampaBayLightning();
                    break;
                case "mapleleafs":
                    torontoMapleLeafs();
                    break;
                case "canucks":
                    vancouverCanucks();
                    break;
                case "goldenknights":
                    vegasGoldenKnights();
                    break;
                case "capitals":
                    washingtonCapitals();
                    break;
                case "jets":
                    winnipegJets();
                    break;
                
           
                    
                    
                default:
                    break;
            } // close switch normal
         } // close if stats normal
        
        
        else if(statsType.toLowerCase().equals("advanced")){
            System.out.println("Advanced stats selected.");
             
         } // close else if
        
    } // close team sorter
    public static int randomizerGoals(){
        Random goals = new Random();

        return goals.nextInt(70);
//        System.out.println(goals);
//        Random assists = new Random();
//        assists.setSeed(40);
//        
//        Random points = new Random();
//        points.setSeed(70);
//        
//        Random saveper = new Random();
//        saveper.setSeed(910);
        
        
    } // close randomizerGoals
    
    public static int randomizerAssists(){
        Random assists = new Random();
        
        return assists.nextInt(90);
        
        
        
        
    } // close randomizerAssists
    
    
    public static void anaheimDucks(){
        System.out.println("Anaheim Ducks selected");
        int goalsGetzlaf = randomizerGoals();
        System.out.println("Number of Getzlaf's goals: " + goalsGetzlaf);
    } // close anaheimDucksnr
    
    public static void arizonaCoyotes(){
        System.out.println("Arizona Coyotes selected");
    } // close arizonaCoyotes
    
    public static void bostonBruins(){
        System.out.println("Boston Bruins selected");
    } // close bostonBruins
    
    public static void buffaloSabres(){
        System.out.println("Buffalo Sabres selected");
    } // close buffaloSabres
    
    public static void calgaryFlames(){
        System.out.println("Calgary Flames selected");
    } // close calgaryFlames
    
    public static void carolinaHurricanes(){
        System.out.println("Carolina Hurricanes selected");
    } // close carolinaHurricanes
    
    public static void chicagoBlackhawks(){
        System.out.println("Chicago Blackhawks selected");
    } // close chicagoBlackhawks
    
    public static void coloradoAvalanche(){
        System.out.println("Colorado Avalanche selected");
    } // close coloradoAvalanche
    
    public static void columbusBlueJackets(){
        System.out.println("Columbus Blue Jackets selected");
    } // close columbusBlueJackets
    
    public static void dallasStars(){
        System.out.println("Dallas Stars selected");
    } // close dallasStars
    
    public static void detroitRedWings(){
        System.out.println("Detroit Red Wings selected");
    } // close detroitRedWings
    
    public static void edmontonOilers(){
        System.out.println("Edmonton Oilers selected");
    } // close edmontonOilers
    
    public static void floridaPanthers(){
        System.out.println("Florida Panthers selected");
    } // close floridaPanthers
    
    public static void losAngelesKings(){
        System.out.println("Los Angeles Kings selected");
    } // close losAngelesKings
    
    public static void minnesotaWild(){
        System.out.println("Minnesota Wild selected");
    } // close minnesotaWild
    
    public static void montrealCanadiens(){
        System.out.println("Montreal Canadiens selected");
    } // close montrealCanadiens
    
    public static void nashvillePredators(){
        System.out.println("Nashville Predators selected");
    } // close nashvillePredators
    
    public static void newJerseyDevils(){
        System.out.println("New Jersey Devils selected");
    } // close newJerseyDevils
    
    public static void newYorkIslanders(){
       System.out.println("New York Islanders selected");
    } // close newYorkIslanders
    
    public static void newYorkRangers(){
        System.out.println("New York Rangers selected");
    } // close newYorkRangers
    
    public static void ottawaSenators(){
        System.out.println("Ottawa Senators selected");
    } // close ottawaSenators
    
    public static void philadelphiaFlyers(){
        System.out.println("Philadelphia Flyers selected");
        int goalsGiroux = randomizerGoals();
        System.out.println("Goals Scored by Giroux: " + goalsGiroux);
        int assistsGiroux = randomizerAssists();
        System.out.println("Assists scored by Giroux: " + assistsGiroux);
        int pointsGiroux;
        pointsGiroux = assistsGiroux + goalsGiroux;
        System.out.println("Total points scored by Giroux: " + pointsGiroux);
        System.out.println(" ");
        
        
        
        int goalsKonecny = randomizerGoals();
        System.out.println("Goals scored by Konecny: " + goalsKonecny);
        int assistsKonecny = randomizerAssists();
        System.out.println("Assists scored by Konecny: " + assistsKonecny);
        int pointsKonecny;
        pointsKonecny = assistsKonecny + goalsKonecny;
        System.out.println("Total points scored by Konecny: " + pointsKonecny);
        System.out.println(" ");
        
        
        int goalsCouturier = randomizerGoals();
        System.out.println("Goals scored by Couturier: " + goalsCouturier);
        int assistsCouturier = randomizerAssists();
        System.out.println("Assists scored by Couturier: " + assistsCouturier);
        int pointsCouturier;
        pointsCouturier = assistsCouturier + goalsCouturier;
        System.out.println("Total points scored by Couturier: " + pointsCouturier);
    } // close philadelphiaFlyers
    
    public static void pittsburghPenguins(){
        System.out.println("Pittsburgh Penguins selected");
        int goalsCrosby = randomizerGoals();
        System.out.println("Goals scored by Crosby: " + goalsCrosby);
        int assistsCrosby = randomizerAssists();
        System.out.println("Assists scored by Crosby: " + assistsCrosby);
        int pointsCrosby;
        pointsCrosby = assistsCrosby + goalsCrosby;
        System.out.println("Total points scored by Crosby: " + pointsCrosby);
        System.out.println(" ");
        
        int goalsMalkin = randomizerGoals();
        System.out.println("Goals scored by Malkin: " + goalsMalkin);
        int assistsMalkin = randomizerAssists();
        System.out.println("Assists scored by Malkin: " + assistsMalkin);
        int pointsMalkin;
        pointsMalkin = assistsMalkin + goalsMalkin;
        System.out.println("Total points scored by Malkin: " + pointsMalkin);
        System.out.println(" ");
        
        int goalsGuentzel = randomizerGoals();
        System.out.println("Goals scored by Guentzel: " + goalsGuentzel);
        int assistsGuentzel = randomizerAssists();
        System.out.println("Assists scored by Guentzel: " + assistsGuentzel);
        int pointsGuentzel;
        pointsGuentzel = assistsGuentzel + goalsGuentzel;
        System.out.println("Total points scored by Guentzel: " + pointsGuentzel);
        
        
        
    } // close pittsburghPenguins
    
    public static void sanJoseSharks(){
        System.out.println("San Jose Sharks selected");
    } // close sanJoseSharks
    
    public static void stLouisBlues(){
        System.out.println("St Louis Blues selected");
    } // close stLouisBlues
    
    public static void tampaBayLightning(){
        System.out.println("Tampa Bay Lightning selected.");
    } // close tampaBayLightning
    
    public static void torontoMapleLeafs(){
        System.out.println("Toronto Maple Leafs selected.");
    } // close torontoMapleLeafs
    
    public static void vancouverCanucks(){
        System.out.println("Vancouver Canucks selected");
    } // close vancouverCanucks
    
    public static void vegasGoldenKnights(){
        System.out.println("Vegas Golden Knights selected");
    } // close vegasGoldenKnights
    
    public static void washingtonCapitals(){
        System.out.println("Washington Capitals selected");
    } // close washingtonCapitals
    
    public static void winnipegJets(){
        System.out.println("Winnipeg Jets selected");
    } // close winnipegJets
    
    
    
    
    
    
    
    
    
    
    
} // close class

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
//    // introducing all players as ints into program
//    
//    // Anaheim Forwards
//    int rickardRakell;
//    int ryanGetzlaf;
//    int ondrejKase;
//    // Arizona Forwards
//    int philKessel;
//    int claytonKeller;
//    int nickSchmaltz;
//    // Boston Forwards
//    int davidPastrnak;
//    int patriceBergeron;
//    int bradMarchand;
//    // Buffalo Forwards
//    int jackEichel;
//    int jeffSkinner;
//    int samReinhart;
//    // Calgary Forwards
//    int johnnyGaudreau;
//    int seanMonahan;
//    int matthewTkachuk;
//    // CarolinaForwards
//    int sebastianAho;
//    int andreiSvechnikov;
//    int teuvoTeravainen;
//    // Chicago Forwards
//    int patrickKane;
//    int jonathanToews;
//    int alexDebrincat;
//    // Colorado Forwards
//    int nathanMackinnon;
//    int mikkoRantanen;
//    int gabrielLandeskog;
//    // Columbus Forwards
//    int pLDubois;
//    int camAtkinson;
//    // Dallas Forwards
//    int tylerSeguin;
//    int jamieBenn;
//    int alexanderRadulov;
//    // Detroit Forwards
//    int dylanLarkin;
//    int anthonyMantha;
//    int tylerBertuzzi;
//    // Edmonton Forwards
//    int connorMcdavid;
//    int leonDraisaitl;
//    int ryanNugentHopkins;
//    // Florida Forwards
//    int aleksanderBarkov;
//    int jonathanHuberdeau;
//    int evgeniiDadonov;
//    // LA Forwards
//    int anzeKopitar;
//    // Minnesota Forwards
//    int jasonZucker;
//    int matsZuccarello;
//    // Montreal Forwards
//    int brendanGallagher;
//    int maxDomi;
//    int jonathanDrouin;
//    // Nashville Forwards
//    int filipForsberg;
//    int viktorArvidsson;
//    int mattDuchene;
//    // New Jersey Forwards
//    int taylorHall;
//    int nicoHischier;
//    int jackHughes;
//    // New York Islanders Forwards
//    int matBarzal;
//    int jordanEberle;
//    int andersLee;
//    // New York Rangers Forwards
//    int artemiPanarin;
//    int mikaZibanejad;
//    int kaapoKakko;
//    // Ottawa Forwards
//    int bradyTkachuk;
//    // Philadelphia Forwards
//    int claudeGiroux;
//    int travisKonecny;
//    int seanCouturier;
//    // Pittsburgh Forwards
//    int sidneyCrosby;
//    int evgeniMalkin;
//    int jakeGuentzel;
//    // San Jose Forwards
//    int evanderKane;
//    int loganCouture;
//    int tomasHertl;
//    // St Louis Forwards
//    int vladimirTarasenko;
//    int jadenSchwartz;
//    int ryanOReilly;
//    // Tampa Forwards
//    int nikitaKucherov;
//    int braydenPoint;
//    int stevenStamkos;
//    // Toronto Forwards
//    int austonMatthews;
//    int mitchMarner;
//    int johnTavares;
//    int williamNylander;
//    // Vancouver Forwards
//    int boHorvat;
//    int eliasPettersson;
//    int brockBoeser;
//    // Vegas Fs
//    int markStone;
//    int maxPacioretty;
//    int jonathanMarchessault;
//     // Washington Fs
//    int alexOvechkin;
//    int evgenyKuznetsov;
//    int nicklasBackstrom;
//    // Winnipeg Fs
//    int markScheifele;
//    int blakeWheeler;
//    int kyleConnor;
//    int patrikLaine;
   
    
            
    
    
    
    
    
    
    public static void main(String[] args){
        teamSorter();
       
        
        } // close main
    
    
        
    public static void teamSorter(){
//        String statsType;
        String normalTeam;
        Scanner input = new Scanner(System.in);
//        System.out.println("Select your stats (normal, advanced)");
//        statsType = input.next();
//        if (statsType.toLowerCase().equals("normal")) {
//            System.out.println("Normal Stats selected.");
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
        
        
//        else if(statsType.toLowerCase().equals("advanced")){
//            System.out.println("Advanced stats selected.");
             
        
        
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
    
    public static int randomizerDefenseGoals(){
        Random goals = new Random();

        return goals.nextInt(30);
        
        
    } // close defense goals
    
    public static int randomizerDefenseAssists(){
        Random assists = new Random();
        
        return assists.nextInt(80);
        
    } // close defense assists
    
    
    public static void anaheimDucks(){
        System.out.println("Anaheim Ducks selected");
        int goalsGetzlaf = randomizerGoals();
        System.out.println("Number of goals scored by Getzlaf: " + goalsGetzlaf);
        int assistsGetzlaf = randomizerAssists();
        System.out.println("Number of assists scored by Getzlaf: " + assistsGetzlaf);
        int pointsGetzlaf = assistsGetzlaf + goalsGetzlaf;
        System.out.println("Total points scored by Getzlaf: " + pointsGetzlaf);
        System.out.println(" ");
        
        int goalsRakell = randomizerGoals();
        System.out.println("Number of goals scored by Rakell: " + goalsRakell);
        int assistsRakell = randomizerAssists();
        System.out.println("Number of assists scored by Rakell: " + assistsRakell);
        int pointsRakell = assistsRakell + goalsRakell;
        System.out.println("Total points scored by Rakell: " + pointsRakell);
        System.out.println(" ");
        
        int goalsKase = randomizerGoals();
        System.out.println("Number of goals scored by Kase: " + goalsKase);
        int assistsKase = randomizerAssists();
        System.out.println("Number of assists scored by Kase: " + assistsKase);
        int pointsKase = assistsKase + goalsKase;
        System.out.println("Total points scored by Kase: " + pointsKase);
        
        System.out.println(" ");
        int goalsFowler = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Fowler: " + goalsFowler);
        int assistsFowler = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Fowler: " + assistsFowler);
        int pointsFowler = assistsFowler + goalsFowler;
        System.out.println("Total points scored by Fowler: "+ pointsFowler);
        
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
        
    } // close anaheimDucksnr
    
    public static void arizonaCoyotes(){
        System.out.println("Arizona Coyotes selected");
        int goalsKessel = randomizerGoals();
        System.out.println("Number of goals scored by Kessel: " + goalsKessel);
        int assistsKessel = randomizerAssists();
        System.out.println("Number of assists scored by Kessel: " + assistsKessel);
        int pointsKessel = assistsKessel + goalsKessel;
        System.out.println("Total points scored by Kessel: " + pointsKessel);
        System.out.println(" ");
        
        int goalsKeller = randomizerGoals();
        System.out.println("Number of goals scored by Keller: " + goalsKeller);
        int assistsKeller = randomizerAssists();
        System.out.println("Number of assists scored by Keller: " + assistsKeller);
        int pointsKeller = assistsKeller + goalsKeller;
        System.out.println("Total points scored by Keller: " + pointsKeller);
        System.out.println(" ");
        
        int goalsSchmaltz = randomizerGoals();
        System.out.println("Number of goals scored by Schmaltz: " + goalsSchmaltz);
        int assistsSchmaltz = randomizerAssists();
        System.out.println("Number of assists scored by Schmaltz: " + assistsSchmaltz);
        int pointsSchmaltz = assistsSchmaltz + goalsSchmaltz;
        System.out.println("Total points scored by Schmaltz: " + pointsSchmaltz);
        
        System.out.println(" ");
        int goalsOEL = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Ekman-Larsson: " + goalsOEL);
        int assistsOEL = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Ekman-Larsson: " + assistsOEL);
        int pointsOEL = assistsOEL + goalsOEL;
        System.out.println("Total points scored by Ekman-Larsson: "+ pointsOEL);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close arizonaCoyotes
    
    public static void bostonBruins(){
        System.out.println("Boston Bruins selected");
        int goalsPastrnak = randomizerGoals();
        System.out.println("Number of goals scored by Pastrnak: " + goalsPastrnak);
        int assistsPastrnak = randomizerAssists();
        System.out.println("Number of assists scored by Pastrnak: " + assistsPastrnak);
        int pointsPastrnak = assistsPastrnak + goalsPastrnak;
        System.out.println("Total points scored by Pastrnak: " + pointsPastrnak);
        System.out.println(" ");
        
        int goalsBergeron = randomizerGoals();
        System.out.println("Number of goals scored by Bergeron: " + goalsBergeron);
        int assistsBergeron = randomizerAssists();
        System.out.println("Number of assists scored by Bergeron: " + assistsBergeron);
        int pointsBergeron = assistsBergeron + goalsBergeron;
        System.out.println("Total points scored by Bergeron: " + pointsBergeron);
        System.out.println(" ");
        
        int goalsMarchand = randomizerGoals();
        System.out.println("Number of goals scored by Marchand: " + goalsMarchand);
        int assistsMarchand = randomizerAssists();
        System.out.println("Number of assists scored by Marchand: " + assistsMarchand);
        int pointsMarchand = assistsMarchand + goalsMarchand;
        System.out.println("Total points scored by Marchand: " + pointsMarchand);
        System.out.println(" ");
        
        System.out.println(" ");
        int goalsKrug = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Krug: " + goalsKrug);
        int assistsKrug = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Krug: " + assistsKrug);
        int pointsKrug = assistsKrug + goalsKrug;
        System.out.println("Total points scored by Krug: "+ pointsKrug);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }

    } // close bostonBruins
    
    public static void buffaloSabres(){
        System.out.println("Buffalo Sabres selected");
        int goalsEichel = randomizerGoals();
        System.out.println("Number of goals scored by Eichel: " + goalsEichel);
        int assistsEichel = randomizerAssists();
        System.out.println("Number of assists scored by Eichel: " + assistsEichel);
        int pointsEichel = assistsEichel + goalsEichel;
        System.out.println("Total points scored by Eichel: " + pointsEichel);
        System.out.println(" ");
        
        int goalsSkinner = randomizerGoals();
        System.out.println("Number of goals scored by Skinner: " + goalsSkinner);
        int assistsSkinner = randomizerAssists();
        System.out.println("Number of assists scored by Skinner: " + assistsSkinner);
        int pointsSkinner = assistsSkinner + goalsSkinner;
        System.out.println("Total points scored by Skinner: " + pointsSkinner);
        System.out.println(" ");
        
        int goalsReinhart = randomizerGoals();
        System.out.println("Number of goals scored by Reinhart: " + goalsReinhart);
        int assistsReinhart = randomizerAssists();
        System.out.println("Number of assists scored by Reinhart: " + assistsReinhart);
        int pointsReinhart = assistsReinhart + goalsReinhart;
        System.out.println("Total points scored by Reinhart: " + pointsReinhart);
        
        System.out.println(" ");
        int goalsDahlin = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Dahlin: " + goalsDahlin);
        int assistsDahlin = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Dahlin: " + assistsDahlin);
        int pointsDahlin = assistsDahlin + goalsDahlin;
        System.out.println("Total points scored by Dahlin: "+ pointsDahlin);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close buffaloSabres
    
    public static void calgaryFlames(){
        System.out.println("Calgary Flames selected");
        int goalsGaudreau = randomizerGoals();
        System.out.println("Number of goals scored by Gaudreau: " + goalsGaudreau);
        int assistsGaudreau = randomizerAssists();
        System.out.println("Number of assists scored by Gaudreau: " + assistsGaudreau);
        int pointsGaudreau = assistsGaudreau + goalsGaudreau;
        System.out.println("Total points scored by Gaudreau: " + pointsGaudreau);
        System.out.println(" ");
        
        int goalsTkachuk = randomizerGoals();
        System.out.println("Number of goals scored by Tkachuk: " + goalsTkachuk);
        int assistsTkachuk = randomizerAssists();
        System.out.println("Number of assists scored by Tkachuk: " + assistsTkachuk);
        int pointsTkachuk = assistsTkachuk + goalsTkachuk;
        System.out.println("Total points scored by Tkachuk: " + pointsTkachuk);
        System.out.println(" ");
        
        int goalsMonahan = randomizerGoals();
        System.out.println("Number of goals scored by Monahan: " + goalsMonahan);
        int assistsMonahan = randomizerAssists();
        System.out.println("Number of assists scored by Monahan: " + assistsMonahan);
        int pointsMonahan = assistsMonahan + goalsMonahan;
        System.out.println("Total points scored by Monahan: " + pointsMonahan);
        
        System.out.println(" ");
        int goalsGio = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Giordano: " + goalsGio);
        int assistsGio = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Giordano: " + assistsGio);
        int pointsGio = assistsGio + goalsGio;
        System.out.println("Total points scored by Giordano: "+ pointsGio);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close calgaryFlames
    
    public static void carolinaHurricanes(){
        System.out.println("Carolina Hurricanes selected");
        
        int goalsAho = randomizerGoals();
        System.out.println("Number of goals scored by Aho: " + goalsAho);
        int assistsAho = randomizerAssists();
        System.out.println("Number of assists scored by Aho: " + assistsAho);
        int pointsAho = assistsAho + goalsAho;
        System.out.println("Total points scored by Aho: " + pointsAho);
        System.out.println(" ");
        
        int goalsSvechnikov = randomizerGoals();
        System.out.println("Number of goals scored by Svechnikov: " + goalsSvechnikov);
        int assistsSvechnikov = randomizerAssists();
        System.out.println("Number of assists scored by Svechnikov: " + assistsSvechnikov);
        int pointsSvechnikov = assistsSvechnikov + goalsSvechnikov;
        System.out.println("Total points scored by Svechnikov: " + pointsSvechnikov);
        System.out.println(" ");
        
        int goalsTeravainen = randomizerGoals();
        System.out.println("Number of goals scored by Teravainen: " + goalsTeravainen);
        int assistsTeravainen = randomizerAssists();
        System.out.println("Number of assists scored by Teravainen: " + assistsTeravainen);
        int pointsTeravainen = assistsTeravainen + goalsTeravainen;
        System.out.println("Total points scored by Teravainen: " + pointsTeravainen);
        
        System.out.println(" ");
        int goalsHamilton = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Hamilton: " + goalsHamilton);
        int assistsHamilton = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Hamilton: " + assistsHamilton);
        int pointsHamilton = assistsHamilton + goalsHamilton;
        System.out.println("Total points scored by Hamilton: "+ pointsHamilton);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close carolinaHurricanes
    
    public static void chicagoBlackhawks(){
        System.out.println("Chicago Blackhawks selected");
        
        int goalsKane = randomizerGoals();
        System.out.println("Number of goals scored by Kane: " + goalsKane);
        int assistsKane = randomizerAssists();
        System.out.println("Number of assists scored by Kane: " + assistsKane);
        int pointsKane = assistsKane + goalsKane;
        System.out.println("Total points scored by Kane: " + pointsKane);
        System.out.println(" ");
        
        int goalsToews = randomizerGoals();
        System.out.println("Number of goals scored by Toews: " + goalsToews);
        int assistsToews = randomizerAssists();
        System.out.println("Number of assists scored by Toews: " + assistsToews);
        int pointsToews = assistsToews + goalsToews;
        System.out.println("Total points scored by Toews: " + pointsToews);
        System.out.println(" ");
        
        int goalsDebrincat = randomizerGoals();
        System.out.println("Number of goals scored by Debrincat: " + goalsDebrincat);
        int assistsDebrincat = randomizerAssists();
        System.out.println("Number of assists scored by Debrincat: " + assistsDebrincat);
        int pointsDebrincat = assistsDebrincat + goalsDebrincat;
        System.out.println("Total points scored by Debrincat: " + pointsDebrincat);
        
        System.out.println(" ");
        int goalsKeith = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Keith: " + goalsKeith);
        int assistsKeith = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Keith: " + assistsKeith);
        int pointsKeith = assistsKeith + goalsKeith;
        System.out.println("Total points scored by Keith: "+ pointsKeith);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close chicagoBlackhawks
    
    public static void coloradoAvalanche(){
        System.out.println("Colorado Avalanche selected");
        
        int goalsMackinnon = randomizerGoals();
        System.out.println("Number of goals scored by Mackinnon: " + goalsMackinnon);
        int assistsMackinnon = randomizerAssists();
        System.out.println("Number of assists scored by Mackinnon: " + assistsMackinnon);
        int pointsMackinnon = assistsMackinnon + goalsMackinnon;
        System.out.println("Total points scored by Mackinnon: " + pointsMackinnon);
        System.out.println(" ");
        
        int goalsRantanen = randomizerGoals();
        System.out.println("Number of goals scored by Rantanen: " + goalsRantanen);
        int assistsRantanen = randomizerAssists();
        System.out.println("Number of assists scored by Rantanen: " + assistsRantanen);
        int pointsRantanen = assistsRantanen + goalsRantanen;
        System.out.println("Total points scored by Rantanen: " + pointsRantanen);
        System.out.println(" ");
        
        int goalsLandeskog = randomizerGoals();
        System.out.println("Number of goals scored by Landeskog: " + goalsLandeskog);
        int assistsLandeskog = randomizerAssists();
        System.out.println("Number of assists scored by Landeskog: " + assistsLandeskog);
        int pointsLandeskog = assistsLandeskog + goalsLandeskog;
        System.out.println("Total points scored by Landeskog: " + pointsLandeskog);
        
        System.out.println(" ");
        int goalsMakar = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Makar: " + goalsMakar);
        int assistsMakar = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Makar: " + assistsMakar);
        int pointsMakar = assistsMakar + goalsMakar;
        System.out.println("Total points scored by Makar: "+ pointsMakar);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        else {
            System.out.println("End of program");
                }
    } // close coloradoAvalanche
    
    public static void columbusBlueJackets(){
        System.out.println("Columbus Blue Jackets selected");
        int goalsDubois = randomizerGoals();
        System.out.println("Number of goals scored by Dubois: " + goalsDubois);
        int assistsDubois = randomizerAssists();
        System.out.println("Number of assists scored by Dubois: " + assistsDubois);
        int pointsDubois = assistsDubois + goalsDubois;
        System.out.println("Total points scored by Dubois: " + pointsDubois);
        System.out.println(" ");
        
        int goalsAtkinson = randomizerGoals();
        System.out.println("Number of goals scored by Atkinson: " + goalsAtkinson);
        int assistsAtkinson = randomizerAssists();
        System.out.println("Number of assists scored by Atkinson: " + assistsAtkinson);
        int pointsAtkinson = assistsAtkinson + goalsAtkinson;
        System.out.println("Total points scored by Atkinson: " + pointsAtkinson);
        
        System.out.println(" ");
        int goalsJones = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Jones: " + goalsJones);
        int assistsJones = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Jones: " + assistsJones);
        int pointsJones = assistsJones + goalsJones;
        System.out.println("Total points scored by Jones: "+ pointsJones);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close columbusBlueJackets
    
    public static void dallasStars(){
        System.out.println("Dallas Stars selected");
        int goalsSeguin = randomizerGoals();
        System.out.println("Number of goals scored by Seguin: " + goalsSeguin);
        int assistsSeguin = randomizerAssists();
        System.out.println("Number of assists scored by Seguin: " + assistsSeguin);
        int pointsSeguin = assistsSeguin + goalsSeguin;
        System.out.println("Total points scored by Seguin: " + pointsSeguin);
        System.out.println(" ");
        
        int goalsBenn = randomizerGoals();
        System.out.println("Number of goals scored by Benn: " + goalsBenn);
        int assistsBenn = randomizerAssists();
        System.out.println("Number of assists scored by Benn: " + assistsBenn);
        int pointsBenn = assistsBenn + goalsBenn;
        System.out.println("Total points scored by Benn: " + pointsBenn);
        System.out.println(" ");
        
        int goalsRadulov = randomizerGoals();
        System.out.println("Number of goals scored by Radulov: " + goalsRadulov);
        int assistsRadulov = randomizerAssists();
        System.out.println("Number of assists scored by Radulov: " + assistsRadulov);
        int pointsRadulov = assistsRadulov + goalsRadulov;
        System.out.println("Total points scored by Radulov: " + pointsRadulov);
        
        System.out.println(" ");
        int goalsKlingberg = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Klingberg: " + goalsKlingberg);
        int assistsKlingberg = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Klingberg: " + assistsKlingberg);
        int pointsKlingberg = assistsKlingberg + goalsKlingberg;
        System.out.println("Total points scored by Klingberg: "+ pointsKlingberg);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close dallasStars
    
    public static void detroitRedWings(){
        System.out.println("Detroit Red Wings selected");
        
        int goalsLarkin = randomizerGoals();
        System.out.println("Number of goals scored by Larkin: " + goalsLarkin);
        int assistsLarkin = randomizerAssists();
        System.out.println("Number of assists scored by Larkin: " + assistsLarkin);
        int pointsLarkin = assistsLarkin + goalsLarkin;
        System.out.println("Total points scored by Larkin: " + pointsLarkin);
        System.out.println(" ");
        
        int goalsMantha = randomizerGoals();
        System.out.println("Number of goals scored by Mantha: " + goalsMantha);
        int assistsMantha = randomizerAssists();
        System.out.println("Number of assists scored by Mantha: " + assistsMantha);
        int pointsMantha = assistsMantha + goalsMantha;
        System.out.println("Total points scored by Mantha: " + pointsMantha);
        System.out.println(" ");
        
        int goalsBertuzzi = randomizerGoals();
        System.out.println("Number of goals scored by Bertuzzi: " + goalsBertuzzi);
        int assistsBertuzzi = randomizerAssists();
        System.out.println("Number of assists scored by Bertuzzi: " + assistsBertuzzi);
        int pointsBertuzzi = assistsBertuzzi + goalsBertuzzi;
        System.out.println("Total points scored by Bertuzzi: " + pointsBertuzzi);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close detroitRedWings
    
    public static void edmontonOilers(){
        System.out.println("Edmonton Oilers selected");
        
        int goalsMcdavid = randomizerGoals();
        System.out.println("Number of goals scored by Mcdavid: " + goalsMcdavid);
        int assistsMcdavid = randomizerAssists();
        System.out.println("Number of assists scored by Mcdavid: " + assistsMcdavid);
        int pointsMcdavid = assistsMcdavid + goalsMcdavid;
        System.out.println("Total points scored by Mcdavid: " + pointsMcdavid);
        System.out.println(" ");
        
        int goalsDraisaitl = randomizerGoals();
        System.out.println("Number of goals scored by Draisaitl: " + goalsDraisaitl);
        int assistsDraisaitl = randomizerAssists();
        System.out.println("Number of assists scored by Draisaitl: " + assistsDraisaitl);
        int pointsDraisaitl = assistsDraisaitl + goalsDraisaitl;
        System.out.println("Total points scored by Draisaitl: " + pointsDraisaitl);
        System.out.println(" ");
        
        int goalsNuge = randomizerGoals();
        System.out.println("Number of goals scored by Nugent-Hopkins: " + goalsNuge);
        int assistsNuge = randomizerAssists();
        System.out.println("Number of assists scored by Nugent-Hopkins: " + assistsNuge);
        int pointsNuge = assistsNuge + goalsNuge;
        System.out.println("Total points scored by Nugent-Hopkins: " + pointsNuge);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close edmontonOilers
    
    public static void floridaPanthers(){
        System.out.println("Florida Panthers selected");
        
        int goalsBarkov = randomizerGoals();
        System.out.println("Number of goals scored by Barkov: " + goalsBarkov);
        int assistsBarkov = randomizerAssists();
        System.out.println("Number of assists scored by Barkov: " + assistsBarkov);
        int pointsBarkov = assistsBarkov + goalsBarkov;
        System.out.println("Total points scored by Barkov: " + pointsBarkov);
        System.out.println(" ");
        
        int goalsHuberdeau = randomizerGoals();
        System.out.println("Number of goals scored by Huberdeau: " + goalsHuberdeau);
        int assistsHuberdeau = randomizerAssists();
        System.out.println("Number of assists scored by Huberdeau: " + assistsHuberdeau);
        int pointsHuberdeau = assistsHuberdeau + goalsHuberdeau;
        System.out.println("Total points scored by Huberdeau: " + pointsHuberdeau);
        System.out.println(" ");
        
        int goalsDadonov = randomizerGoals();
        System.out.println("Number of goals scored by Dadonov: " + goalsDadonov);
        int assistsDadonov = randomizerAssists();
        System.out.println("Number of assists scored by Dadonov: " + assistsDadonov);
        int pointsDadonov = assistsDadonov + goalsDadonov;
        System.out.println("Total points scored by Dadonov: " + pointsDadonov);
        
        System.out.println(" ");
        int goalsYandle = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Yandle: " + goalsYandle);
        int assistsYandle = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Yandle: " + assistsYandle);
        int pointsYandle = assistsYandle + goalsYandle;
        System.out.println("Total points scored by Yandle: "+ pointsYandle);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close floridaPanthers
    
    public static void losAngelesKings(){
        System.out.println("Los Angeles Kings selected");
        
        int goalsKopitar = randomizerGoals();
        System.out.println("Number of goals scored by Kopitar: " + goalsKopitar);
        int assistsKopitar = randomizerAssists();
        System.out.println("Number of assists scored by Kopitar: " + assistsKopitar);
        int pointsKopitar = assistsKopitar + goalsKopitar;
        System.out.println("Total points scored by Kopitar: " + pointsKopitar);
        
        System.out.println(" ");
        int goalsDoughty = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Doughty: " + goalsDoughty);
        int assistsDoughty = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Doughty: " + assistsDoughty);
        int pointsDoughty = assistsDoughty + goalsDoughty;
        System.out.println("Total points scored by Doughty: "+ pointsDoughty);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close losAngelesKings
    
    public static void minnesotaWild(){
        System.out.println("Minnesota Wild selected");
        
        int goalsZuccarello = randomizerGoals();
        System.out.println("Number of goals scored by Zuccarello: " + goalsZuccarello);
        int assistsZuccarello = randomizerAssists();
        System.out.println("Number of assists scored by Zuccarello: " + assistsZuccarello);
        int pointsZuccarello = assistsZuccarello + goalsZuccarello;
        System.out.println("Total points scored by Zuccarello: " + pointsZuccarello);
        System.out.println(" ");
        
        int goalsZucker = randomizerGoals();
        System.out.println("Number of goals scored by Zucker: " + goalsZucker);
        int assistsZucker = randomizerAssists();
        System.out.println("Number of assists scored by Zucker: " + assistsZucker);
        int pointsZucker = assistsZucker + goalsZucker;
        System.out.println("Total points scored by Zucker: " + pointsZucker);
        
        System.out.println(" ");
        int goalsDumba = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Dumba: " + goalsDumba);
        int assistsDumba = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Dumba: " + assistsDumba);
        int pointsDumba = assistsDumba + goalsDumba;
        System.out.println("Total points scored by Dumba: "+ pointsDumba);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close minnesotaWild
    
    public static void montrealCanadiens(){
        System.out.println("Montreal Canadiens selected");
        
        int goalsDomi = randomizerGoals();
        System.out.println("Number of goals scored by Domi: " + goalsDomi);
        int assistsDomi = randomizerAssists();
        System.out.println("Number of assists scored by Domi: " + assistsDomi);
        int pointsDomi = assistsDomi + goalsDomi;
        System.out.println("Total points scored by Domi: " + pointsDomi);
        System.out.println(" ");
        
        int goalsGallagher = randomizerGoals();
        System.out.println("Number of goals scored by Gallagher: " + goalsGallagher);
        int assistsGallagher = randomizerAssists();
        System.out.println("Number of assists scored by Gallagher: " + assistsGallagher);
        int pointsGallagher = assistsGallagher + goalsGallagher;
        System.out.println("Total points scored by Gallagher: " + pointsGallagher);
        System.out.println(" ");
        
        int goalsDrouin = randomizerGoals();
        System.out.println("Number of goals scored by Drouin: " + goalsDrouin);
        int assistsDrouin = randomizerAssists();
        System.out.println("Number of assists scored by Drouin: " + assistsDrouin);
        int pointsDrouin = assistsDrouin + goalsDrouin;
        System.out.println("Total points scored by Drouin: " + pointsDrouin);
        
        System.out.println(" ");
        int goalsWeber = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Weber: " + goalsWeber);
        int assistsWeber = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Weber: " + assistsWeber);
        int pointsWeber = assistsWeber + goalsWeber;
        System.out.println("Total points scored by Weber: "+ pointsWeber);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close montrealCanadiens
    
    public static void nashvillePredators(){
        System.out.println("Nashville Predators selected");
        
        int goalsForsberg = randomizerGoals();
        System.out.println("Number of goals scored by Forsberg: " + goalsForsberg);
        int assistsForsberg = randomizerAssists();
        System.out.println("Number of assists scored by Forsberg: " + assistsForsberg);
        int pointsForsberg = assistsForsberg + goalsForsberg;
        System.out.println("Total points scored by Forsberg: " + pointsForsberg);
        System.out.println(" ");
        
        int goalsArvidsson = randomizerGoals();
        System.out.println("Number of goals scored by Arvidsson: " + goalsArvidsson);
        int assistsArvidsson = randomizerAssists();
        System.out.println("Number of assists scored by Arvidsson: " + assistsArvidsson);
        int pointsArvidsson = assistsArvidsson + goalsArvidsson;
        System.out.println("Total points scored by Arvidsson: " + pointsArvidsson);
        System.out.println(" ");
        
        int goalsDuchene = randomizerGoals();
        System.out.println("Number of goals scored by Duchene: " + goalsDuchene);
        int assistsDuchene = randomizerAssists();
        System.out.println("Number of assists scored by Duchene: " + assistsDuchene);
        int pointsDuchene = assistsDuchene + goalsDuchene;
        System.out.println("Total points scored by Duchene: " + pointsDuchene);
        
        System.out.println(" ");
        int goalsJosi = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Josi: " + goalsJosi);
        int assistsJosi = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Josi: " + assistsJosi);
        int pointsJosi = assistsJosi + goalsJosi;
        System.out.println("Total points scored by Josi: "+ pointsJosi);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close nashvillePredators
    
    public static void newJerseyDevils(){
        System.out.println("New Jersey Devils selected");
        
        int goalsHall = randomizerGoals();
        System.out.println("Number of goals scored by Hall: " + goalsHall);
        int assistsHall = randomizerAssists();
        System.out.println("Number of assists scored by Hall: " + assistsHall);
        int pointsHall = assistsHall + goalsHall;
        System.out.println("Total points scored by Hall: " + pointsHall);
        System.out.println(" ");
        
        int goalsHischier = randomizerGoals();
        System.out.println("Number of goals scored by Hischier: " + goalsHischier);
        int assistsHischier = randomizerAssists();
        System.out.println("Number of assists scored by Hischier: " + assistsHischier);
        int pointsHischier = assistsHischier + goalsHischier;
        System.out.println("Total points scored by Hischier: " + pointsHischier);
        System.out.println(" ");
        
        int goalsHughes = randomizerGoals();
        System.out.println("Number of goals scored by Hughes: " + goalsHughes);
        int assistsHughes = randomizerAssists();
        System.out.println("Number of assists scored by Hughes: " + assistsHughes);
        int pointsHughes = assistsHughes + goalsHughes;
        System.out.println("Total points scored by Hughes: " + pointsHughes);
        
        System.out.println(" ");
        int goalsSubban = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Subban: " + goalsSubban);
        int assistsSubban = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Subban: " + assistsSubban);
        int pointsSubban = assistsSubban + goalsSubban;
        System.out.println("Total points scored by Subban: "+ pointsSubban);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close newJerseyDevils
    
    public static void newYorkIslanders(){
       System.out.println("New York Islanders selected");
       
       int goalsBarzal = randomizerGoals();
        System.out.println("Number of goals scored by Barzal: " + goalsBarzal);
        int assistsBarzal = randomizerAssists();
        System.out.println("Number of assists scored by Barzal: " + assistsBarzal);
        int pointsBarzal = assistsBarzal + goalsBarzal;
        System.out.println("Total points scored by Barzal: " + pointsBarzal);
        System.out.println(" ");
        
        int goalsEberle = randomizerGoals();
        System.out.println("Number of goals scored by Eberle: " + goalsEberle);
        int assistsEberle = randomizerAssists();
        System.out.println("Number of assists scored by Eberle: " + assistsEberle);
        int pointsEberle = assistsEberle + goalsEberle;
        System.out.println("Total points scored by Eberle: " + pointsEberle);
        System.out.println(" ");
        
        int goalsLee = randomizerGoals();
        System.out.println("Number of goals scored by Lee: " + goalsLee);
        int assistsLee = randomizerAssists();
        System.out.println("Number of assists scored by Lee: " + assistsLee);
        int pointsLee = assistsLee + goalsLee;
        System.out.println("Total points scored by Lee: " + pointsLee);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close newYorkIslanders
    
    public static void newYorkRangers(){
        System.out.println("New York Rangers selected");
        
        int goalsZ = randomizerGoals();
        System.out.println("Number of goals scored by Zibanejad: " + goalsZ);
        int assistsZ = randomizerAssists();
        System.out.println("Number of assists scored by Zibanejad: " + assistsZ);
        int pointsZ = assistsZ + goalsZ;
        System.out.println("Total points scored by Zibanejad: " + pointsZ);
        System.out.println(" ");
        
        int goalsPanarin = randomizerGoals();
        System.out.println("Number of goals scored by Panarin: " + goalsPanarin);
        int assistsPanarin = randomizerAssists();
        System.out.println("Number of assists scored by Panarin: " + assistsPanarin);
        int pointsPanarin = assistsPanarin + goalsPanarin;
        System.out.println("Total points scored by Panarin: " + pointsPanarin);
        System.out.println(" ");
        
        int goalsKakko = randomizerGoals();
        System.out.println("Number of goals scored by Kakko: " + goalsKakko);
        int assistsKakko = randomizerAssists();
        System.out.println("Number of assists scored by Kakko: " + assistsKakko);
        int pointsKakko = assistsKakko + goalsKakko;
        System.out.println("Total points scored by Kakko: " + pointsKakko);
        
        System.out.println(" ");
        int goalsTrouba = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Trouba: " + goalsTrouba);
        int assistsTrouba = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Trouba: " + assistsTrouba);
        int pointsTrouba = assistsTrouba + goalsTrouba;
        System.out.println("Total points scored by Trouba: "+ pointsTrouba);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close newYorkRangers
    public static void ottawaSenators(){
        System.out.println("Ottawa Senators selected");
        
        int goalsTkachuk = randomizerGoals();
        System.out.println("Number of goals scored by Tkachuk: " + goalsTkachuk);
        int assistsTkachuk = randomizerAssists();
        System.out.println("Number of assists scored by Tkachuk: " + assistsTkachuk);
        int pointsTkachuk = assistsTkachuk + goalsTkachuk;
        System.out.println("Total points scored by Tkachuk: " + pointsTkachuk);
        
        System.out.println(" ");
        int goalsChabot = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Chabot: " + goalsChabot);
        int assistsChabot = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Chabot: " + assistsChabot);
        int pointsChabot = assistsChabot + goalsChabot;
        System.out.println("Total points scored by Chabot: "+ pointsChabot);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
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
        
        System.out.println(" ");
        int goalsProvorov = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Provorov: " + goalsProvorov);
        int assistsProvorov = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Provorov: " + assistsProvorov);
        int pointsProvorov = assistsProvorov + goalsProvorov;
        System.out.println("Total points scored by Provorov: "+ pointsProvorov);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
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
        
        System.out.println(" ");
        int goalsLetang = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Letang: " + goalsLetang);
        int assistsLetang = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Letang: " + assistsLetang);
        int pointsLetang = assistsLetang + goalsLetang;
        System.out.println("Total points scored by Letang: "+ pointsLetang);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
        
//        System.out.println("Total Goals scored by Daniel Sprong: 89");
        
//        System.out.println("Total points scored by Derrick Pouliot: 227");
        
        
        
    } // close pittsburghPenguins
    
    public static void sanJoseSharks(){
        System.out.println("San Jose Sharks selected");
        
        int goalsCouture = randomizerGoals();
        System.out.println("Number of goals scored by Couture: " + goalsCouture);
        int assistsCouture = randomizerAssists();
        System.out.println("Number of assists scored by Couture: " + assistsCouture);
        int pointsCouture = assistsCouture + goalsCouture;
        System.out.println("Total points scored by Couture: " + pointsCouture);
        System.out.println(" ");
        
        int goalsHertl = randomizerGoals();
        System.out.println("Number of goals scored by Hertl: " + goalsHertl);
        int assistsHertl = randomizerAssists();
        System.out.println("Number of assists scored by Hertl: " + assistsHertl);
        int pointsHertl = assistsHertl + goalsHertl;
        System.out.println("Total points scored by Hertl: " + pointsHertl);
        System.out.println(" ");
        
        int goalsKane = randomizerGoals();
        System.out.println("Number of goals scored by Kane: " + goalsKane);
        int assistsKane = randomizerAssists();
        System.out.println("Number of assists scored by Kane: " + assistsKane);
        int pointsKane = assistsKane + goalsKane;
        System.out.println("Total points scored by Kane: " + pointsKane);
        
        System.out.println(" ");
        int goalsKarlsson = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Karlsson: " + goalsKarlsson);
        int assistsKarlsson = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Karlsson: " + assistsKarlsson);
        int pointsKarlsson = assistsKarlsson + goalsKarlsson;
        System.out.println("Total points scored by Karlsson: "+ pointsKarlsson);
        
        System.out.println(" ");
        int goalsBurns = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Burns: " + goalsBurns);
        int assistsBurns = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Burns: " + assistsBurns);
        int pointsBurns = assistsBurns + goalsBurns;
        System.out.println("Total points scored by Burns: "+ pointsBurns);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close sanJoseSharks
    
    public static void stLouisBlues(){
        System.out.println("St Louis Blues selected");
        
        int goalsT = randomizerGoals();
        System.out.println("Number of goals scored by Tarasenko: " + goalsT);
        int assistsT = randomizerAssists();
        System.out.println("Number of assists scored by Tarasenko: " + assistsT);
        int pointsT = assistsT + goalsT;
        System.out.println("Total points scored by Tarasenko: " + pointsT);
        System.out.println(" ");
        
        int goalsSchwartz = randomizerGoals();
        System.out.println("Number of goals scored by Schwartz: " + goalsSchwartz);
        int assistsSchwartz = randomizerAssists();
        System.out.println("Number of assists scored by Schwartz: " + assistsSchwartz);
        int pointsSchwartz = assistsSchwartz + goalsSchwartz;
        System.out.println("Total points scored by Schwartz: " + pointsSchwartz);
        System.out.println(" ");
        
        int goalsOReilly = randomizerGoals();
        System.out.println("Number of goals scored by O'Reilly: " + goalsOReilly);
        int assistsOReilly = randomizerAssists();
        System.out.println("Number of assists scored by O'Reilly: " + assistsOReilly);
        int pointsOReilly = assistsOReilly + goalsOReilly;
        System.out.println("Total points scored by O'Reilly: " + pointsOReilly);
        
        System.out.println(" ");
        int goalsP = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Pietrangelo: " + goalsP);
        int assistsP = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Pietrangelo: " + assistsP);
        int pointsP = assistsP + goalsP;
        System.out.println("Total points scored by Pietrangelo: "+ pointsP);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close stLouisBlues
    
    public static void tampaBayLightning(){
        System.out.println("Tampa Bay Lightning selected.");
        
        int goalsKuch = randomizerGoals();
        System.out.println("Number of goals scored by Kucherov: " + goalsKuch);
        int assistsKuch = randomizerAssists();
        System.out.println("Number of assists scored by Kucherov: " + assistsKuch);
        int pointsKuch = assistsKuch + goalsKuch;
        System.out.println("Total points scored by Kucherov: " + pointsKuch);
        System.out.println(" ");
        
        int goalsPoint = randomizerGoals();
        System.out.println("Number of goals scored by Point: " + goalsPoint);
        int assistsPoint = randomizerAssists();
        System.out.println("Number of assists scored by Point: " + assistsPoint);
        int pointsPoint = assistsPoint + goalsPoint;
        System.out.println("Total points scored by Point: " + pointsPoint);
        System.out.println(" ");
        
        int goalsStamkos = randomizerGoals();
        System.out.println("Number of goals scored by Stamkos: " + goalsStamkos);
        int assistsStamkos = randomizerAssists();
        System.out.println("Number of assists scored by Stamkos: " + assistsStamkos);
        int pointsStamkos = assistsStamkos + goalsStamkos;
        System.out.println("Total points scored by Stamkos: " + pointsStamkos);
        
        System.out.println(" ");
        int goalsHedman = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Hedman: " + goalsHedman);
        int assistsHedman = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Hedman: " + assistsHedman);
        int pointsHedman = assistsHedman + goalsHedman;
        System.out.println("Total points scored by Hedman: "+ pointsHedman);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close tampaBayLightning
    
    public static void torontoMapleLeafs(){
        System.out.println("Toronto Maple Leafs selected.");
        
        int goalsMatthews = randomizerGoals();
        System.out.println("Number of goals scored by Matthews: " + goalsMatthews);
        int assistsMatthews = randomizerAssists();
        System.out.println("Number of assists scored by Matthews: " + assistsMatthews);
        int pointsMatthews = assistsMatthews + goalsMatthews;
        System.out.println("Total points scored by Matthews: " + pointsMatthews);
        System.out.println(" ");
        
        int goalsMarner = randomizerGoals();
        System.out.println("Number of goals scored by Marner: " + goalsMarner);
        int assistsMarner = randomizerAssists();
        System.out.println("Number of assists scored by Marner: " + assistsMarner);
        int pointsMarner = assistsMarner + goalsMarner;
        System.out.println("Total points scored by Marner: " + pointsMarner);
        System.out.println(" ");
        
        int goalsTavares = randomizerGoals();
        System.out.println("Number of goals scored by Tavares: " + goalsTavares);
        int assistsTavares = randomizerAssists();
        System.out.println("Number of assists scored by Tavares: " + assistsTavares);
        int pointsTavares = assistsTavares + goalsTavares;
        System.out.println("Total points scored by Tavares: " + pointsTavares);
        System.out.println(" ");
        
        int goalsNylander = randomizerGoals();
        System.out.println("Number of goals scored by Nylander: " + goalsNylander);
        int assistsNylander = randomizerAssists();
        System.out.println("Number of assists scored by Nylander: " + assistsNylander);
        int pointsNylander = assistsNylander + goalsNylander;
        System.out.println("Total points scored by Nylander: " + pointsNylander);
        
        System.out.println(" ");
        int goalsRielly = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Rielly: " + goalsRielly);
        int assistsRielly = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Rielly: " + assistsRielly);
        int pointsRielly = assistsRielly + goalsRielly;
        System.out.println("Total points scored by Rielly: "+ pointsRielly);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close torontoMapleLeafs
    
    public static void vancouverCanucks(){
        System.out.println("Vancouver Canucks selected");
        
        int goalsHorvat = randomizerGoals();
        System.out.println("Number of goals scored by Horvat: " + goalsHorvat);
        int assistsHorvat = randomizerAssists();
        System.out.println("Number of assists scored by Horvat: " + assistsHorvat);
        int pointsHorvat = assistsHorvat + goalsHorvat;
        System.out.println("Total points scored by Horvat: " + pointsHorvat);
        System.out.println(" ");
        
        int goalsPettersson = randomizerGoals();
        System.out.println("Number of goals scored by Pettersson: " + goalsPettersson);
        int assistsPettersson = randomizerAssists();
        System.out.println("Number of assists scored by Petterson: " + assistsPettersson);
        int pointsPettersson = assistsPettersson + goalsPettersson;
        System.out.println("Total points scored by Pettersson: " + pointsPettersson);
        System.out.println(" ");
        
        int goalsBoeser = randomizerGoals();
        System.out.println("Number of goals scored by Boeser: " + goalsBoeser);
        int assistsBoeser = randomizerAssists();
        System.out.println("Number of assists scored by Boeser: " + assistsBoeser);
        int pointsBoeser = assistsBoeser + goalsBoeser;
        System.out.println("Total points scored by Boeser: " + pointsBoeser);
        
        System.out.println(" ");
        int goalsHughes = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Hughes: " + goalsHughes);
        int assistsHughes = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Hughes: " + assistsHughes);
        int pointsHughes = assistsHughes + goalsHughes;
        System.out.println("Total points scored by Hughes: "+ pointsHughes);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close vancouverCanucks
    
    public static void vegasGoldenKnights(){
        System.out.println("Vegas Golden Knights selected");
        
        int goalsStone = randomizerGoals();
        System.out.println("Number of goals scored by Stone: " + goalsStone);
        int assistsStone = randomizerAssists();
        System.out.println("Number of assists scored by Stone: " + assistsStone);
        int pointsStone = assistsStone + goalsStone;
        System.out.println("Total points scored by Stone: " + pointsStone);
        System.out.println(" ");
        
        int goalsMarchessault = randomizerGoals();
        System.out.println("Number of goals scored by Marchessault: " + goalsMarchessault);
        int assistsMarchessault = randomizerAssists();
        System.out.println("Number of assists scored by Marchessault: " + assistsMarchessault);
        int pointsMarchessault = assistsMarchessault + goalsMarchessault;
        System.out.println("Total points scored by Marchessault: " + pointsMarchessault);
        System.out.println(" ");
        
        int goalsPacioretty = randomizerGoals();
        System.out.println("Number of goals scored by Pacioretty: " + goalsPacioretty);
        int assistsPacioretty = randomizerAssists();
        System.out.println("Number of assists scored by Pacioretty: " + assistsPacioretty);
        int pointsPacioretty = assistsPacioretty + goalsPacioretty;
        System.out.println("Total points scored by Pacioretty: " + pointsPacioretty);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close vegasGoldenKnights
    
    public static void washingtonCapitals(){
        System.out.println("Washington Capitals selected");
        
        int goalsOvi = randomizerGoals();
        System.out.println("Number of goals scored by Ovechkin: " + goalsOvi);
        int assistsOvi = randomizerAssists();
        System.out.println("Number of assists scored by Ovechkin: " + assistsOvi);
        int pointsOvi = assistsOvi + goalsOvi;
        System.out.println("Total points scored by Ovechkin: " + pointsOvi);
        System.out.println(" ");
        
        int goalsBackstrom = randomizerGoals();
        System.out.println("Number of goals scored by Backstrom: " + goalsBackstrom);
        int assistsBackstrom = randomizerAssists();
        System.out.println("Number of assists scored by Backstrom: " + assistsBackstrom);
        int pointsBackstrom = assistsBackstrom + goalsBackstrom;
        System.out.println("Total points scored by Backstrom: " + pointsBackstrom);
        System.out.println(" ");
        
        int goalsKuznetsov = randomizerGoals();
        System.out.println("Number of goals scored by Kuznetsov: " + goalsKuznetsov);
        int assistsKuznetsov = randomizerAssists();
        System.out.println("Number of assists scored by Kuznetsov: " + assistsKuznetsov);
        int pointsKuznetsov = assistsKuznetsov + goalsKuznetsov;
        System.out.println("Total points scored by Kuznetsov: " + pointsKuznetsov);
        
        System.out.println(" ");
        int goalsCarlson = randomizerDefenseGoals();
        System.out.println("Number of goals scored by Carlson: " + goalsCarlson);
        int assistsCarlson = randomizerDefenseAssists();
        System.out.println("Number of assists scored by Carlson: " + assistsCarlson);
        int pointsCarlson = assistsCarlson + goalsCarlson;
        System.out.println("Total points scored by Carlson: "+ pointsCarlson);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
    } // close washingtonCapitals
    
    public static void winnipegJets(){
        System.out.println("Winnipeg Jets selected");
        
        int goalsLaine = randomizerGoals();
        System.out.println("Number of goals scored by Laine: " + goalsLaine);
        int assistsLaine = randomizerAssists();
        System.out.println("Number of assists scored by Laine: " + assistsLaine);
        int pointsLaine = assistsLaine + goalsLaine;
        System.out.println("Total points scored by Laine: " + pointsLaine);
        System.out.println(" ");
        
        int goalsWheeler = randomizerGoals();
        System.out.println("Number of goals scored by Wheeler: " + goalsWheeler);
        int assistsWheeler = randomizerAssists();
        System.out.println("Number of assists scored by Wheeler: " + assistsWheeler);
        int pointsWheeler = assistsWheeler + goalsWheeler;
        System.out.println("Total points scored by Wheeler: " + pointsWheeler);
        System.out.println(" ");
        
        int goalsConnor = randomizerGoals();
        System.out.println("Number of goals scored by Connor: " + goalsConnor);
        int assistsConnor = randomizerAssists();
        System.out.println("Number of assists scored by Connor: " + assistsConnor);
        int pointsConnor = assistsConnor + goalsConnor;
        System.out.println("Total points scored by Connor: " + pointsConnor);
        System.out.println(" ");
        
        int goalsScheifele = randomizerGoals();
        System.out.println("Number of goals scored by Scheifele: " + goalsScheifele);
        int assistsScheifele = randomizerAssists();
        System.out.println("Number of assists scored by Scheifele: " + assistsScheifele);
        int pointsScheifele = assistsScheifele + goalsScheifele;
        System.out.println("Total points scored by Scheifele: " + pointsScheifele);
        
        System.out.println(" ");
        String again;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to pick another team?");
        again = input.next();
        if (again.toLowerCase().equals("yes")){
            teamSorter();
        } // close if
        
        else {
            System.out.println("End of program");
                }
        
    } // close winnipegJets
    
    
    
    
    
    
    
    
    
    
    
} // close class

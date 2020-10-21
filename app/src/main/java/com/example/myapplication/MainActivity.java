package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    String AnaoNomesF[] = {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"};
    String AnaoNomesM[] = {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"};
    String AnaoSobrenomes[] = {"Balderk", "Battlehammer", "Brawnanvil", "Dankil", "Fireforge", "Frostbeard", "Gorunn", "Holderhek", "Ironfist", "Loderr", "Lutgehr", "Rumnaheim", "Strakeln", "Torunn", "Ungart"};

    String ElfoNomesF[] = {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"};
    String ElfoNomesM[] = {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric", "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren", "Varis"};
    String ElfoNomesInfantil[] = {"Ara", "Bryn", "Del", "Eryn", "Faen", "Innil", "Lael", "Mella", "Naill", "Naeris", "Phann", "Rael", "Rinn", "Sai", "Syllin", "Thia", "Vall"};
    String ElfoSobrenomes[] = {"Amakiir (Joia Florida)", "Amastacia (Flor das Estrelas)", "Galanodel (Sussurro da Lua)", "Holimion (Orvalho dos Diamantes)", "Ilphelkiir (Pétala Preciosa)", "Liadon (Folha de Prata)", "Meliamne (Calcanhar de Carvalho)", "Nailo (Brisa da Noite)", "Siannodel (Córrego Lunar)", "Xiloscient (Pétala de Ouro)"};

    String HalflingNomesM[] = {"Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich", "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby"};
    String HalflingNomesF[] = {"Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"};
    String HalflingSobrenomes[] = {"Cata-Escovas", "Bom-Barril", "Garrafa Verde", "Alta Colina", "Baixa Colina", "Prato Cheio", "Folha de Chá", "Espinhudo", "Cinto Frouxo", "Galho Caído"};

    String HumanoNomesF[] = {"Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora", "Yasheira", "Zasheida", "Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tessele", "Alethra", "Kara", "Katernin", "Natali", "Olma", "Tana", "Zora", "Amafrey", "Betha", "Cefrey", "Kethra", "Mara", "Olga", "Silifrey", "Westra", "Arizima", "Chathi", "Nephis", "Nulara", "Murithi", "Sefris", "Thola", "Umara", "Zolis", "Fyevarra", "Hulmarra", "Immith", "Imzel", "Navarra", "Shevarra", "Tammith", "Yuldra", "Bai", "Chao", "Jia", "Lei", "Mei", "Qiao", "Shui", "Tai", "Balama", "Dona", "Faila", "Jalana", "Luisa", "Marta", "Quara", "Selise", "Vonda"};
    String HumanoNomesM[] = {"Aseir", "Bardeid", "Haseid", "Khemed", "Mehmen", "Sudeiman", "Zasheir", "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn", "Randal", "Stedd", "Bor", "Fodel", "Glar", "Grigor", "Igan", "Ivor", "Kosef", "Mival", "Orel", "Pavel", "Sergor", "Ander", "Blath", "Bran", "Frath", "Geth", "Lander", "Luth", "Malcer", "Stor", "Taman", "Urth", "Aoth", "Bareris", "Ehput-Ki", "Kethoth", "Mumed", "Ramas", "So-Kehur", "Thazar-De", "Urhur", "Borivik", "Faurgar", "Jandar", "Kanithar", "Madislak", "Ralmevik", "Shaumar", "Vladislak", "An", "Chen", "Chi", "Fai", "Jiang", "Jun", "Lian", "Long", "Meng", "On", "Shan", "Shui", "Wen", "Anton", "Diero", "Marcon", "Pieron", "Rimardo", "Romero", "Salazar", "Umbero"};
    String HumanoSobrenomes[] = {"Basha", "Dumein", "Jassan", "Khalid", "Mostana", "Pashar", "Rein", "Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag", "Bersk", "Chernin", "Dotsk", "Kulenov", "Marsk", "Nemetsk", "Shemov", "Starag", "Brightwood", "Helder", "Hornraven", "Lackman", "Stormwind", "Windrivver", "Ankhalab", "Anskuld", "Fezim", "Hahpet", "Nathandem", "Sepret", "Uuthrakt", "Chergoba", "Dyernina", "Iltazyara", "Murnyethara", "Stayanoga", "Ulmokina", "Chien", "Huang", "Kao", "Kung", "Lao", "Ling", "Mei", "Pin", "Shin", "Sum", "Tan", "Wan", "Agosto", "Astorio", "Calabra", "Domine", "Falone", "Marivaldi", "Pisacar", "Ramondo"};

    String DraconatoNomesF[] = {"Akra", "Biri", "Daar", "Farideh", "Harann", "Flavilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Sora", "Surina", "Thava", "Uadjit"};
    String DraconatoNomesM[] = {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Heskan", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Tarhun", "Torinn"};
    String DraconatoNomesInfantil[] = {"Climber", "Earbender", "Leaper", "Pious", "Shieldbiter", "Zealous"};
    String DraconatoSobrenomes[] = {"Clethtinthiallor", "Daardendrian", "Delmirev", "Drachedandion", "Fenkenkabradon", "Kepeshkmolik", "Kerrhylon", "Kimbatuul", "Linxakasendalor", "Myastan", "Nemmonis", "Norixius", "Ophinshtalajiir", "Prexijandilin", "Shestendeliath", "Turnuroth", "Verthisathurgiesh", "Yarjerit"};

    String GnomoNomesF[] = {"Bimpnottin", "Breena", "Caramip", "Carlin", "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick", "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna"};
    String GnomoNomesM[] = {"Alston", "Alvyn", "Boddynock", "Brocc", "Burgell", "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble", "Glim", "Jebeddo", "Kellen", "Namfoodle", "Orryn", "Roondar", "Seebo", "Sindri", "Warryn", "Wrenn", "Zook"};
    String GnomoSobrenomes[] = {"Beren", "Daergel", "Folkor", "Garrick", "Nackle", "Murnig", "Ningel", "Raulnor", "Scheppen", "Timbers", "Turen"};
    String GnomoApelidos[] = {"Beberrão", "Pó de Coração", "Texugo", "Manto", "Tranca-Dupla", "Bate-Carteira", "Fnipper", "Ku", "Nim", "Um Sapato", "Pústula", "Gema Faiscante", "Pato Desajeitado"};

    String MeioElfoNomesF[] = {"Atenção: Meio-Elfos adotam tanto nomes humanos quanto élficos, por isso escolha na sessão de Nomes Humanos ou Élficos!"};
    String MeioElfoNomesM[] = {"Atenção: Meio-Elfos adotam tanto nomes humanos quanto élficos, por isso escolha na sessão de Nomes Humanos ou Élficos!"};
    String MeioElfoNomesInfantil[] = {"Atenção: Meio-Elfos adotam tanto nomes humanos quanto élficos, por isso escolha na sessão de Nomes Humanos ou Élficos!"};
    String MeioElfoSobrenomes[] = {"Atenção: Meio-Elfos adotam tanto nomes humanos quanto élficos, por isso escolha na sessão de Nomes Humanos ou Élficos!"};

    String MeioOrcNomesF[] = {"Baggi", "Emen", "Engong", "Kansif", "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Sutha", "Vola", "Volen", "Yevelda"};
    String MeioOrcNomesM[] = {"Dench", "Feng", "Gell", "Henk", "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump", "Thokk"};

    String TieflingNomesF[] = {"Akta", "Anakis", "Bryseis", "Criella", "Damaia", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Orianna", "Phelaia", "Rieta"};
    String TieflingNomesM[] = {"Akmenos", "Amnon", "Barakas", "Damakos", "Ekemon", "Iados", "Kairon", "Leucis", "Melech", "Mordai", "Morthos", "Pelaios", "Skamos", "Therai"};

    public void gerarAnao (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rAnaoM = random.nextInt(AnaoNomesM.length);
        int rAnaoF = random.nextInt(AnaoNomesF.length);
        int rAnaoS = random.nextInt(AnaoSobrenomes.length);

        texto1.setText("Anã (F): " + AnaoNomesF[rAnaoF]);
        texto2.setText("Anão (M): " + AnaoNomesM[rAnaoM]);
        texto3.setText("Clã: " + AnaoSobrenomes[rAnaoS]);

    }

    public void gerarElfo (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rElfoM = random.nextInt(ElfoNomesM.length);
        int rElfoF = random.nextInt(ElfoNomesF.length);
        int rElfoS = random.nextInt(ElfoSobrenomes.length);

        texto1.setText("Elfa (F): " + ElfoNomesF[rElfoF]);
        texto2.setText("Elfo (M): " + ElfoNomesM[rElfoM]);
        texto3.setText("Sobrenome: " + ElfoSobrenomes[rElfoS]);

    }

    public void gerarHalfling (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rHalflingM = random.nextInt(HalflingNomesM.length);
        int rHalflingF = random.nextInt(HalflingNomesF.length);
        int rHalflingS = random.nextInt(HalflingSobrenomes.length);

        texto1.setText("Halfling (F): " + HalflingNomesF[rHalflingF]);
        texto2.setText("Halfling (M): " + HalflingNomesM[rHalflingM]);
        texto3.setText("Família: " + HalflingSobrenomes[rHalflingS]);

    }

    public void gerarHumano (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rHumanoM = random.nextInt(HumanoNomesM.length);
        int rHumanoF = random.nextInt(HumanoNomesF.length);
        int rHumanoS = random.nextInt(HumanoSobrenomes.length);

        texto1.setText("Mulher (F): " + HumanoNomesF[rHumanoF]);
        texto2.setText("Homem (M): " + HumanoNomesM[rHumanoM]);
        texto3.setText("Sobrenome: " + HumanoSobrenomes[rHumanoS]);

    }

    public void gerarDraconato (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rDracoM = random.nextInt(DraconatoNomesM.length);
        int rDracoF = random.nextInt(DraconatoNomesF.length);
        int rDracoS = random.nextInt(DraconatoSobrenomes.length);

        texto1.setText("Draconato (F): " + DraconatoNomesF[rDracoF]);
        texto2.setText("Draconato (M): " + DraconatoNomesM[rDracoM]);
        texto3.setText("Clã: " + DraconatoSobrenomes[rDracoS]);

    }

    public void gerarGnomo (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rGnomoM = random.nextInt(GnomoNomesM.length);
        int rGnomoF = random.nextInt(GnomoNomesF.length);
        int rGnomoS = random.nextInt(GnomoSobrenomes.length);
        int rGnomoAp = random.nextInt(GnomoApelidos.length);

        texto1.setText("Gnoma (F): " + GnomoNomesF[rGnomoF]);
        texto2.setText("Gnomo (M): " + GnomoNomesM[rGnomoM]);
        texto3.setText("Clã e Apelido: " + GnomoSobrenomes[rGnomoS] + " (" + GnomoApelidos[rGnomoAp] + ")");

    }

    public void gerarMeioOrc (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rMeiOrcM = random.nextInt(MeioOrcNomesM.length);
        int rMeiOrcF = random.nextInt(MeioOrcNomesF.length);

        texto1.setText("Meio-Orc (F): " + MeioOrcNomesF[rMeiOrcF]);
        texto2.setText("Meio-Orc (M): " + MeioOrcNomesM[rMeiOrcM]);
        texto3.setText(" ");

    }

    public void gerarTiefling (View v){

        TextView texto1 = findViewById(R.id.textoNomes1);
        TextView texto2 = findViewById(R.id.textoNomes2);
        TextView texto3 = findViewById(R.id.textoNomes3);

        int rTieflingM = random.nextInt(TieflingNomesM.length);
        int rTieflingF = random.nextInt(TieflingNomesF.length);

        texto1.setText("Tiefling (F): " + TieflingNomesF[rTieflingF]);
        texto2.setText("Tiefling (M): " + TieflingNomesM[rTieflingM]);
        texto3.setText(" ");

    }

}
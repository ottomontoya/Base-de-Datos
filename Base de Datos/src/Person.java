import java.time.Year;
import java.util.Random;

public class Person {
    //v pr
    private String fname1, fname2, lname1, lname2, dbirth, state, curp, sql;
    private char sex;
    private int month_income;
    private float height;
    private double weight;
    private boolean deceased;
    //v aux
    private int auxSex, auxNombre, auxn1, auxn2, auxl1, auxl2;
    private int auxDia, auxMes, auxYear, auxEstado, auxMrt;
    private float auxH;
    private double auxPeso;
    private boolean bisiesto;
    private String[] hombres = {
            "Abel","Abelardo","Adolfo","Adriano","Alberto","Alejandro","Alexis","Alonso","Andrés","Ángel","Ariel",
            "Arturo","Bartolomé","Bruno","Caín","César","Christian","Claudio","Constancio","Constantino","Daniel",
            "Domingo","Felipe","Félix","Fermín","Gabriel","Giovanni","Hilario","Humberto","Jairo","Kevin","Leopoldo",
            "Lucas","Luis","Marcos","Martín","Miguel","Néstor","Nicolás","Otto","Oscar","Ramón","Ricardo","René",
            "Salvador","Sergio","Tobías","Ulises","Vicente","Zacarías"
    };
    private String[] mujeres = {
            "África","Alana","Alice","Alma","Amina","Amy","Ana","Angélica","Ariadna","Belén","Berta","Blanca","Camila",
            "Celia","Charlotte","Chloe","Cristina","Daniela","Diana","Dulce","Elia","Emily","Emma","Eva","Gabriela",
            "Gala","Iria","Jana","Jimena","Josefina","Juana","Lisa","Lola","Lucía","Luciana","Manuela","Mariana",
            "Maricarmen","Martina","Mía","Raquel","Salma","Salomé","Sara","Silvia","Sofía","Valentina","Valeria",
            "Zaira","Zoe"
    };
    private String[] apellidos = {
            "Abreu","Acosta","Aguilar","Alcocer","Alonso","Alpuche","Álvarez","Arellano","Arias","Baeza","Barrera",
            "Barroso","Basulto","Benítez","Bermúdez","Blanco","Bojórquez","Borja","Bracho","Bravo","Caballero",
            "Cabrera","Calvo","Camacho","Campos","Cano","Canto","Cardona","Carmona","Carrasco","Carrillo","Castillo",
            "Castro","Ceballos","Cedeño","Chávez","Córdova","Cortés","Crespo","Cruz","Cuevas","Delgado","Díaz","Diez",
            "Domínguez","Durán","Escobar","Estrada","Fajardo","Fernández","Ferrer","Figueroa","Flores","Fuentes",
            "Gallardo","Gallego","García","Garrido","Garza","Gil","Giménez","Gómez","Góngora","González","Guerrero",
            "Gutiérrez","Hernández","Herrera","Herrero","Hidalgo","Hinojosa","Huerta","Hurtado","Ibáñez","Iglesias",
            "Infante","Irigoyen","Jiménez","Lazcano","León","López","Lozano","Marín","Márquez","Martínez","Medina",
            "Méndez","Miranda","Molina","Montoya","Mora","Morales","Moreno","Moya","Muñoz","Navarro","Nieto","Núñez",
            "Olivares","Orellana","Ortega","Ortiz","Parra","Pascual","Peña","Pérez","Prieto","Ramírez","Ramos","Reyes",
            "Rodríguez","Rojas","Román","Romero","Rubio","Ruiz","Ruz","Sáenz","Salazar","Sánchez","Sandoval","Santana",
            "Santos","Sanz","Serrano","Soler","Soto","Suárez","Tapia","Torre","Torres","Urcelay","Valencia",
            "Valenzuela","Valladares","Vargas","Vázquez","Vega","Vela","Velasco","Vera","Vidal","Villa","Villavicencio",
            "Zambrano","Zapata","Zavaleta","Zazueta","Zedillo","Zenteno"
    };
    private String[] estado = {
            "AS","BC","BS","CC","CL","CM","CS","CH","DF","DG","GT","GR","HG","JC","MC","MN","MS","NT","NL","OC","PL",
            "QT","QR","SP","SL","SR","TC","TS","TL","VZ","YN","ZS"
    };

    //C
    public Person() {
        this.fname1 = "";
        this.fname2 = "";
        this.lname1 = "";
        this.lname2 = "";
        this.dbirth = "0000-00-00";
        this.state = "";
        this.curp = "";
        this.sex = ' ';
        this.height = 0;
        this.weight = 0;
        this.deceased = false;
    }

    //A
    public String getFname1() {
        return fname1;
    }

    public String getFname2() {
        return fname2;
    }

    public String getLname1() {
        return lname1;
    }

    public String getLname2() {
        return lname2;
    }

    public String getDbirth() {
        return dbirth;
    }

    public String getState() {
        return state;
    }

    public String getCurp() {
        return curp;
    }

    public char getSex() {
        return sex;
    }

    public int getMonth_income() {
        return month_income;
    }

    public float getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isDeceased() {
        return deceased;
    }

    public String getSql() {
        return sql;
    }

    //M
    public void generate(){
        //nombre
        auxSex = new Random().nextInt(100);
        if (auxSex < 57){
            auxNombre = new Random().nextInt(100);
            if (auxNombre >= 42){
                auxn1 = new Random().nextInt(50);
                auxn2 = new Random().nextInt(50);
                auxl1 = new Random().nextInt(150);
                auxl2 = new Random().nextInt(150);

                while (auxn1 == auxn2){
                    auxn2 = new Random().nextInt(49);
                }

                this.fname1 = hombres[auxn1];
                this.fname2 = hombres[auxn2];
                this.lname1 = apellidos[auxl1];
                this.lname2 = apellidos[auxl2];
                this.sex = 'H';
            } else {
                auxn1 = new Random().nextInt(50);
                auxl1 = new Random().nextInt(150);
                auxl2 = new Random().nextInt(150);

                this.fname1 = hombres[auxn1];
                this.lname1 = apellidos[auxl1];
                this.lname2 = apellidos[auxl2];
                this.sex = 'H';
            }
        } else {
            auxNombre = new Random().nextInt(100);
            if (auxNombre >= 42){
                auxn1 = new Random().nextInt(50);
                auxn2 = new Random().nextInt(50);
                auxl1 = new Random().nextInt(150);
                auxl2 = new Random().nextInt(150);

                while (auxn1 == auxn2){
                    auxn2 = new Random().nextInt(50);
                }

                this.fname1 = mujeres[auxn1];
                this.fname2 = mujeres[auxn2];
                this.lname1 = apellidos[auxl1];
                this.lname2 = apellidos[auxl2];
                this.sex = 'M';
            } else {
                auxn1 = new Random().nextInt(50);
                auxl1 = new Random().nextInt(150);
                auxl2 = new Random().nextInt(150);

                this.fname1 = mujeres[auxn1];
                this.lname1 = apellidos[auxl1];
                this.lname2 = apellidos[auxl2];
                this.sex = 'M';
            }
        }

        //fecha
        auxYear = new Random().nextInt(2000-1943) + 1943;
        if (auxYear == 1944 | auxYear == 1948 | auxYear == 1952 | auxYear == 1956 | auxYear == 1960 |
                auxYear == 1964 | auxYear == 1968 | auxYear == 1972 | auxYear == 1976 | auxYear == 1980 |
                auxYear == 1984 | auxYear == 1988 | auxYear == 1992 | auxYear == 1996){
            bisiesto =  true;
        } else {
            bisiesto = false;
        }
        auxMes = new Random().nextInt(13 - 1) + 1;
        if (auxMes == 1 | auxMes == 3 | auxMes == 5 | auxMes == 7 | auxMes == 8 | auxMes == 10 | auxMes == 12){
            auxDia = new Random().nextInt(32 - 1) + 1;
        } else if (auxMes == 4 | auxMes == 6 | auxMes == 9 | auxMes == 11){
            auxDia = new Random().nextInt(31 - 1) + 1;
        } else if (bisiesto){
            auxDia = new Random().nextInt(30 - 1) + 1;
        } else {
            auxDia = new Random().nextInt(29 - 1) + 1;
        }
        this.dbirth = String.valueOf(auxYear) + "-" + String.valueOf(auxMes) + "-" + String.valueOf(auxDia);

        //fallecido
        auxMrt = new Random().nextInt(100);
        if (auxMrt < 12){
            this.deceased = true;
        } else {
            this.deceased = false;
        }

        //Estado
        auxEstado = new Random().nextInt(33);
        this.state = estado[auxEstado];
        //Altura
        auxH =  new Random().nextInt(213 - 150) + 150;
        this.height = auxH / 100;

        //Peso
        auxPeso = new Random().nextInt(117436 - 50000) + 50000;
        this.weight = auxPeso / 1000;

        //income
        this.month_income = new Random().nextInt(85001 - 7350) + 7350;

        //curp
        this.curp += this.lname1.charAt(0);
        for (int i=1; i < this.lname1.length()-1; i++){
            if (this.lname1.charAt(i) == 'a' | this.lname1.charAt(i) == 'e' | this.lname1.charAt(i) == 'i' | this.lname1.charAt(i) == 'o' |
                    this.lname1.charAt(i) == 'u' | this.lname1.charAt(i) == 'á' | this.lname1.charAt(i) == 'é' | this.lname1.charAt(i) == 'í' |
                    this.lname1.charAt(i) == 'ó' | this.lname1.charAt(i) == 'ú'){
                this.curp += this.lname1.charAt(i);
                break;
            }
        }
        this.curp += this.lname2.charAt(0);
        this.curp += this.fname1.charAt(0);
        if (auxMes < 10){
            if (auxDia < 10){
                this.curp += this.dbirth.charAt(2);
                this.curp += this.dbirth.charAt(3);
                this.curp += '0';
                this.curp += this.dbirth.charAt(5);
                this.curp += '0';
                this.curp += this.dbirth.charAt(7);
            } else {
                this.curp += this.dbirth.charAt(2);
                this.curp += this.dbirth.charAt(3);
                this.curp += '0';
                this.curp += this.dbirth.charAt(5);
                this.curp += this.dbirth.charAt(7);
                this.curp += this.dbirth.charAt(8);
            }
        } else {
            if (auxDia < 10){
                this.curp += this.dbirth.charAt(2);
                this.curp += this.dbirth.charAt(3);
                this.curp += this.dbirth.charAt(5);
                this.curp += this.dbirth.charAt(6);
                this.curp += '0';
                this.curp += this.dbirth.charAt(8);
            } else {
                this.curp += this.dbirth.charAt(2);
                this.curp += this.dbirth.charAt(3);
                this.curp += this.dbirth.charAt(5);
                this.curp += this.dbirth.charAt(6);
                this.curp += this.dbirth.charAt(8);
                this.curp += this.dbirth.charAt(9);
            }
        }
        this.curp += this.sex;
        this.curp += this.state;
        for (int i=1; i < this.lname1.length()-1; i++){
            if (this.lname1.charAt(i) != 'a' & this.lname1.charAt(i) != 'e' & this.lname1.charAt(i) != 'i' & this.lname1.charAt(i) != 'o' &
                    this.lname1.charAt(i) != 'u' & this.lname1.charAt(i) != 'á' & this.lname1.charAt(i) != 'é' & this.lname1.charAt(i) != 'í' &
                    this.lname1.charAt(i) != 'ó' & this.lname1.charAt(i) != 'ú'){
                this.curp += this.lname1.charAt(i);
                break;
            }
        }
        for (int i=1; i < this.lname2.length()-1; i++){
            if (this.lname2.charAt(i) != 'a' & this.lname2.charAt(i) != 'e' & this.lname2.charAt(i) != 'i' & this.lname2.charAt(i) != 'o' &
                    this.lname2.charAt(i) != 'u' & this.lname2.charAt(i) != 'á' & this.lname2.charAt(i) != 'é' & this.lname2.charAt(i) != 'í' &
                    this.lname2.charAt(i) != 'ó' & this.lname2.charAt(i) != 'ú'){
                this.curp += this.lname2.charAt(i);
                break;
            }
        }
        for (int i=1; i < this.fname1.length()-1; i++){
            if (this.fname1.charAt(i) != 'a' & this.fname1.charAt(i) != 'e' & this.fname1.charAt(i) != 'i' & this.fname1.charAt(i) != 'o' &
                    this.fname1.charAt(i) != 'u' & this.fname1.charAt(i) != 'á' & this.fname1.charAt(i) != 'é' & this.fname1.charAt(i) != 'í' &
                    this.fname1.charAt(i) != 'ó' & this.fname1.charAt(i) != 'ú'){
                this.curp += this.fname1.charAt(i);
                break;
            }
        }
    }

    public void sql(){
        if (this.fname2 == null){
            sql = "INSERT INTO people (fname1, fname2, lname1, lname2, dbirth, curp, sex, height, weight, " +
                    "month_income, deceased, state)\n" + "VALUES ('" + this.fname1 + "',' ','" + this.lname1 + "','" +
                    this.lname2 + "','" + this.dbirth + "'," + "'" + this.curp.toUpperCase() + "','" + this.sex + "'," +
                    this.height + "," + this.weight + "," + this.month_income + "," + this.deceased + ",'" + this.state
                    + "')";

        } else {
            sql = "INSERT INTO people (fname1, fname2, lname1, lname2, dbirth, curp, sex, height, weight, " +
                    "month_income, deceased, state)\n" + "VALUES ('" + this.fname1 + "','" + this.fname2 + "','" +
                    this.lname1 + "','" + this.lname2 + "','" + this.dbirth + "'," + "'" + this.curp.toUpperCase() +
                    "','" + this.sex + "'," + this.height + "," + this.weight + "," + this.month_income + "," +
                    this.deceased + ",'" + this.state + "')";
        }
    }
}

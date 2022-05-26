package KeywordPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Keyword
{
//
//    private String text;
//    private KeywordType type;
//    private List<String> professions;
//    private List<String> symptoms;
//    private List<String> procedures;
//
//    public Keyword(String text, KeywordType type)
//    {
//        this.text = text;
//        this.type = type;
//    }



    public enum Profession
    {
        ALLERGOLOGIE,
        ALLGEMEINMEDIZIN,
        ALTERNATIVE_MEDIZIN,
        ANATOMIE,
        ANAESTHESIOLOGIE,
        ARBEITSMEDIZIN,
        AUGENHEILKUNDE_UND_OPTOMETRIE,
        CHIRUGIE,
        DERMATOLOGIE_UND_VENEROLOGIE,
        GENETIK,
        GERIATRIE,
        GYNAEKOLOGIE_UND_GEBURTSHILFE,
        HALS_NASE_OHRENHEILKUNDE,
        HISTOLOGIE_ZYTOLOGIE_EMBRYOLOGIE,
        HAEMATOLOGIE,
        IMMUNOLOGIE,
        INNERE_MEDIZIN,
        INTENSIVMEDIZIN,
        KINDERCHIRUGIE,
        LABORMEDIZIN,
        MANUELLE_MEDIZIN_UND_CHIROTHERAPIE,
        MEDIZINISCHE_BIOCHEMIE_UND_BIOPHYSIK,
        MEDIZINISCHE_STATISTIK,
        MIKROBIOLOGIE_VIROLOGIE_INFEKTIOLOGIE,
        MUND_KIEFER_CHIRUGIE,
        NEUROCHIRUGIE,
        NEUROLOGIE,
        NOTFALLMEDIZIN,
        NUKLEARMEDIZIN,
        ORTHOPAEDIE,
        OEFFENTLICHES_GESUNDHEITSWESEN,
        PALLIATIVMEDIZIN,
        PATHOLOGIE,
        PAEDIATRIE,
        PHARAMAKOLOGIE_UND_TOXIKOLOGIE,
        PHYSIKALISCHE_MEDIZIN_UND_REHABILITATION,
        PHYSIOLOGIE,
        PLASTISCHE_CHIRUGIE,
        PNEUMOLOGIE,
        PSYCHIATRIE,
        PSYCHOLOGIE,
        RADIOLOGIE,
        RECHTSMEDIZIN,
        SCHMERZTHERAPIE,
        SOZIALMEDIZIN_PRAEVENTIVMEDIZIN_SEXUALMEDIZIN,
        SPORTMEDIZIN,
        TRANSFUSIONSMEDIZIN,
        UNFALLCHIRUIGIE_UND_TRAUMATOLOGIE,
        UROLOGIE,
        ZAHNMEDIZIN



    }


    public enum Symptom
    {
        BILIRUBIN_IM_BLUT_DIREKT_ERNIEDRIGT,
        ULTRASCHALLGESTEUERTE_BRUSTBIOPSIE,
        SERUM_CROSSLAPS_ERHOEHT,
        BETA_CROSSLAPS,
        VOXEL_BASIERTES_SPEZIFISCHES_REGIONALES_ANALYSESYSTEM,
        MRT_SIGNALAENDERUNG_IM_GEHIRN,
        MRT_SIGNALAENDERUNG_IM_HIRNSTAM,
        MRT_SIGNALAENDERUNG_IM_KLEINHIRN,
        MRT_SIGNALAENDERUNG_IN_DEN_BASALGANGLIEN,
        MRT_SIGNALAENDERUNG_IM_THALAMUS,
        ERHOEHTER_IFG_1,
        ELETRORETINOGRAMM_A_WELLEN_AMPLITUDE_ERNIEDRIGT,
        ELETRORETINOGRAMM_B_WELLEN_AMPLITUDE_ERNIEDRIGT,
        CHRMOGENER_TEST_ZUR_FAKTOR_X_AKTIVITAETSBESTIMMUNG_NORMAL,
        CHRMOGENER_TEST_ZUR_ANTI_FAKTOR_XA_BESTIMMUNG_NORMAL,
        FENO_NORMAL,
        FENO_ANORMAL,
        GASTRALE_RESIDULVOLUMEN_HOCH,
        MAXILLOFAZIALER_CT_SCAN_NORMAL,
        MAXILLOFAZIALER_CT_SCAN,
        MAXILLOFAZIALER_CT_SCAN_ANORMAL,
        DE_RITIS_QUOTIENT,
        NORMOBLASTENZAHL,
        GESCHAETZTE_GLOMERULAERE_FILTRATIONSRATE,
        GESCHAETZTE_GFR,
        ZYSTIN_IN_LEUKOZYTEN_ERHOEHT,
        COENZYM_Q_ERHOEHT,
        VIRUS_ABSTRICH,
        LYNPHKNOTEN_EXZISIONSBIOPSIE,
        NCIHTINVASIVE_PRAENATALE_UNTERSUCHUNG,
        PRAENATALES_ZELLFREIES_DNA_SCREENING,
        BIOSPSIE_DES_OMENTUMS,
        HUEFT_ARATHROSKOPIE


    }

    public enum Procedure
    {
        MUMFORD_VERFAHREN,
        GLAUKOMDRAINAGE_IMPLITATION,
        GLAUKOM_DRAINAGEOPERATION,
        EPIGLOTTISLAPPENREKONSTRUKTION,
        DERMIS_FETT_TRANSPLANAT,
        BIOTIN_ERGAENZUNG,
        PANTOTHENSAEURE_ERGAENZUNG,
        MITTLERE_LUNGENLOBEKTOMIE,
        OBERE_LUNGENLOBEKTOMIE,
        LUNGENBILOBEKTOMIE,
        EXTRAPLEURALE_LUNGENBILOBEKTOMIE,
        EXTRAPLEURALE_LUNGENLOBEKTOMIE,
        SLEEVE_LOBEKTOMIE,
        UNTERE_LUNGENLOBEKTOMIE,
        SLEEVE_PNEUMONONEKTOMIE,
        INTRAVESIKALE_BCG_THERAPIE,
        ZAHNBRUECKENPLATZIERUNG,
        ASPIRATIONSTHROMBEKTOMIE,
        IMPLANTIERBARER_LOOP_RECORDER,
        RADIOFREQUENZ_NEUROTMOIE,
        BURCH_VERFAHREN,
        FOKALE_ADIPOLYSE,
        INJEKTIONSLIPOLYSE,
        UNTERKINN_LIPOLYSE,
        INTERNE_REPERATUR_EINER_HERNIE,
        DEKOMPRESSION_DES_NERVUS_TRIGEMINUS,
        ELEKTROMAGNETISCHE_THERAPIE,
        ENDOMETRIOSE_KAUTERISIERUNG,





    }


    public enum Languag
    {
        DANISH,
        CHINESE,
        FINNISH,
        CZECH,
        DUTCH,
        NORWEGIAN,
        ENGLISH,
        FRENCH,
        GERMAN,
        SWEDISH,
        GREEK,
        HINDI,
        ITALIAN,
        BULGARIAN,
        JAPANESE,
        KOREAN,
        POLISH,
        ROMANIAN,
        PORTUGUESE,
        RUSSIAN,
        SPANISH

    }

    public enum Location
    {
        AUSTRIA,
        GERMANY,
        UNITED_KINGDOM,
        SCOTLAND,
        DENMARK,
        FINLAND,
        NORWAY,
        SWEDEN,
        SWITZERLAND,
        FRANCE,
        ITALY,
        METHERLANDS,
        MEXICO,
        RUSSIA,
        SPAIN,
        GREECE


    }

//    public List<Enum<?>> showKeywords(KeywordType type)
//    {
//        initializeLists();
//        ;
//        switch(type) {
//            case PROFESSION -> {
//                return Arrays.stream(Profession.values()).toList();
//            }
//            case SYMPTOM -> {
//                return symptoms;
//            }
//            case PROCEDURE -> {
//                return procedures;
//            }
//        }
//        return Collections.singletonList("Keyword not found");
//    }

//    public void initializeLists()
//    {
//
//        professions = Arrays.asList("Allergologie",
//                "Allgemeinmedizin",
//                "Alternative Medizin",
//                "Anatomie",
//                "Anästhesiologie",
//                "Arbeitsmedizin",
//                "Augenheilkunde und Optometrie",
//                "Chirurgie",
//                "Dermatologie und Venerologie",
//                "Genetik",
//                "Geriatrie",
//                "Gynäkologie und Geburtshilfe",
//                "Hals-Nasen-Ohrenheilkunde",
//                "Histologie; Zytologie; Embryologie",
//                "Hämatologie",
//                "Immunologie",
//                "Innere Medizin",
//                "Intensivmedizin",
//                "Kinderchirurgie",
//                "Labormedizin",
//                "Manuelle Medizin und Chirotherapie",
//                "Medizinische Biochemie und Biophysik",
//                "Medizinische Statistik",
//                "Mikrobiologie; Virologie; Infektiologie",
//                "Mund-Kiefer-Chirurgie",
//                "Neurochirurgie",
//                "Neurologie",
//                "Notfallmedizin",
//                "Nuklearmedizin",
//                "Orthopädie",
//                "Öffentliches Gesundheitswesen",
//                "Palliativmedizin",
//                "Pathologie",
//                "Pädiatrie",
//                "Pharmakologie und Toxikologie",
//                "Physikalische Medizin und Rehabilitation",
//                "Physiologie",
//                "Plastische Chirurgie",
//                "Pneumologie",
//                "Psychiatrie",
//                "Psychologie",
//                "Radiologie",
//                "Rechtsmedizin",
//                "Schmerztherapie",
//                "Sozialmedizin; Präventivmedizin; Sexualmedizin",
//                "Sportmedizin",
//                "Transfusionsmedizin",
//                "Unfallchirurgie und Traumatologie",
//                "Urologie",
//                "Zahnmedizin");
//
//        procedures = Arrays.asList("Mumford-Verfahren",
//                "Glaukomdrainage-Implantation",
//                "Glaukom-Drainageoperation",
//                "Epiglottislappenrekonstruktion",
//                "Dermis-Fett-Transplantat",
//                "Biotin-Ergänzung",
//                "Pantothensäure-Ergänzung",
//                "Mittlere Lungenlobektomie",
//                "Obere Lungenlobektomie",
//                "Lungenbilobektomie",
//                "Extrapleurale Lungenbilobektomie",
//                "Extrapleurale Lungenlobektomie",
//                "Sleeve-Lobektomie",
//                "Untere Lungenlobektomie",
//                "Sleeve-Pneumonektomie",
//                "Intravesikale BCG-Therapie",
//                "Zahnbrückenplatzierung",
//                "Aspirationsthrombektomie",
//                "Implantierbarer Loop-Recorder",
//                "Radiofrequenz-Neurotomie",
//                "Burch-Verfahren",
//                "Fokale Adipolyse",
//                "Injektionslipolyse",
//                "Unterkinn-Lipolyse",
//                "Interne Reparatur einer Hernie",
//                "Dekompression des Nervus trigeminus",
//                "Elektromagnetische Therapie",
//                "Endometriose-Kauterisierung");
//        symptoms = Arrays.asList("Bilirubin im Blut direkt erniedrigt",
//                "Ultraschallgesteuerte Brustbiopsie",
//                "Serum-Crosslaps erhöht",
//                "Beta-Crosslaps",
//                "Voxel-basiertes spezifisches regionales Analysesystem",
//                "MRT-Signaländerungen im Gehirn",
//                "MRT-Signaländerungen im Hirnstamm",
//                "MRT-Signaländerungen im Kleinhirn",
//                "MRT-Signaländerungen in den Basalganglien",
//                "MRT-Signaländerungen im Thalamus",
//                "Erhöhter IGF-1",
//                "Elektroretinogramm A-Wellen-Amplitude erniedrigt",
//                "Elektroretinogramm B-Wellen-Amplitude erniedrigt",
//                "Chromogener Test zur Faktor X-Aktivitätsbestimmung normal",
//                "Chromogener Test zur Anti-Faktor Xa-Bestimmung normal",
//                "FENO normal",
//                "FENO anomal",
//                "Gastrale Residualvolumen hoch",
//                "Maxillofazialer CT-Scan normal",
//                "Maxillofazialer CT-Scan",
//                "Maxillofazialer CT-Scan anomal",
//                "De-Ritis-Quotient",
//                "Normoblastenzahl",
//                "Geschätzte glomeruläre Filtrationsrate",
//                "Geschätzte GFR",
//                "Zystin in Leukozyten erhöht",
//                "Coenzym Q erhöht",
//                "Virus-Abstrich",
//                "Lymphknoten-Exzisionsbiopsie",
//                "Nichtinvasive pränatale Untersuchung",
//                "Pränatales zellfreies DNA-Screening",
//                "Biopsie des Omentums",
//                "Hueft-Arthroskopie");
//    }

}


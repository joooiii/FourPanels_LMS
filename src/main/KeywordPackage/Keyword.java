package KeywordPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Keyword
{

    private String text;
    private KeywordType type;
    private List<String> professions;
    private List<String> symptoms;
    private List<String> procedures;

    public Keyword(String text, KeywordType type)
    {
        this.text = text;
        this.type = type;
    }

    public enum KeywordType
    {
        PROFESSION,

        SYMPTOM,

        PROCEDURE;

    }

    public List<String> showKeywords(KeywordType type)
    {
        initializeLists();
        switch(type) {
            case PROFESSION -> {
                return professions;
            }
            case SYMPTOM -> {
                return symptoms;
            }
            case PROCEDURE -> {
                return procedures;
            }
        }
        return Collections.singletonList("Keyword not found");
    }

    public void initializeLists()
    {
        professions = Arrays.asList("Allergologie",
                "Allgemeinmedizin",
                "Alternative Medizin",
                "Anatomie",
                "Anästhesiologie",
                "Arbeitsmedizin",
                "Augenheilkunde und Optometrie",
                "Chirurgie",
                "Dermatologie und Venerologie",
                "Genetik",
                "Geriatrie",
                "Gynäkologie und Geburtshilfe",
                "Hals-Nasen-Ohrenheilkunde",
                "Histologie; Zytologie; Embryologie",
                "Hämatologie",
                "Immunologie",
                "Innere Medizin",
                "Intensivmedizin",
                "Kinderchirurgie",
                "Labormedizin",
                "Manuelle Medizin und Chirotherapie",
                "Medizinische Biochemie und Biophysik",
                "Medizinische Statistik",
                "Mikrobiologie; Virologie; Infektiologie",
                "Mund-Kiefer-Chirurgie",
                "Neurochirurgie",
                "Neurologie",
                "Notfallmedizin",
                "Nuklearmedizin",
                "Orthopädie",
                "Öffentliches Gesundheitswesen",
                "Palliativmedizin",
                "Pathologie",
                "Pädiatrie",
                "Pharmakologie und Toxikologie",
                "Physikalische Medizin und Rehabilitation",
                "Physiologie",
                "Plastische Chirurgie",
                "Pneumologie",
                "Psychiatrie",
                "Psychologie",
                "Radiologie",
                "Rechtsmedizin",
                "Schmerztherapie",
                "Sozialmedizin; Präventivmedizin; Sexualmedizin",
                "Sportmedizin",
                "Transfusionsmedizin",
                "Unfallchirurgie und Traumatologie",
                "Urologie",
                "Zahnmedizin");

        procedures = Arrays.asList("Mumford-Verfahren",
                "Glaukomdrainage-Implantation",
                "Glaukom-Drainageoperation",
                "Epiglottislappenrekonstruktion",
                "Dermis-Fett-Transplantat",
                "Biotin-Ergänzung",
                "Pantothensäure-Ergänzung",
                "Mittlere Lungenlobektomie",
                "Obere Lungenlobektomie",
                "Lungenbilobektomie",
                "Extrapleurale Lungenbilobektomie",
                "Extrapleurale Lungenlobektomie",
                "Sleeve-Lobektomie",
                "Untere Lungenlobektomie",
                "Sleeve-Pneumonektomie",
                "Intravesikale BCG-Therapie",
                "Zahnbrückenplatzierung",
                "Aspirationsthrombektomie",
                "Implantierbarer Loop-Recorder",
                "Radiofrequenz-Neurotomie",
                "Burch-Verfahren",
                "Fokale Adipolyse",
                "Injektionslipolyse",
                "Unterkinn-Lipolyse",
                "Interne Reparatur einer Hernie",
                "Dekompression des Nervus trigeminus",
                "Elektromagnetische Therapie",
                "Endometriose-Kauterisierung");
        symptoms = Arrays.asList("Bilirubin im Blut direkt erniedrigt",
                "Ultraschallgesteuerte Brustbiopsie",
                "Serum-Crosslaps erhöht",
                "Beta-Crosslaps",
                "Voxel-basiertes spezifisches regionales Analysesystem",
                "MRT-Signaländerungen im Gehirn",
                "MRT-Signaländerungen im Hirnstamm",
                "MRT-Signaländerungen im Kleinhirn",
                "MRT-Signaländerungen in den Basalganglien",
                "MRT-Signaländerungen im Thalamus",
                "Erhöhter IGF-1",
                "Elektroretinogramm A-Wellen-Amplitude erniedrigt",
                "Elektroretinogramm B-Wellen-Amplitude erniedrigt",
                "Chromogener Test zur Faktor X-Aktivitätsbestimmung normal",
                "Chromogener Test zur Anti-Faktor Xa-Bestimmung normal",
                "FENO normal",
                "FENO anomal",
                "Gastrale Residualvolumen hoch",
                "Maxillofazialer CT-Scan normal",
                "Maxillofazialer CT-Scan",
                "Maxillofazialer CT-Scan anomal",
                "De-Ritis-Quotient",
                "Normoblastenzahl",
                "Geschätzte glomeruläre Filtrationsrate",
                "Geschätzte GFR",
                "Zystin in Leukozyten erhöht",
                "Coenzym Q erhöht",
                "Virus-Abstrich",
                "Lymphknoten-Exzisionsbiopsie",
                "Nichtinvasive pränatale Untersuchung",
                "Pränatales zellfreies DNA-Screening",
                "Biopsie des Omentums",
                "Hueft-Arthroskopie");
    }

}


package CasePackage;
import validation.Ensurer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MediaSection extends Section
{

    private String mimeType;
    private Path path;

    public MediaSection(Path path, String title)
    {

        super(title);
        this.path = Path.of(addNewFile(path));

    }

    public String addNewFile(Path path)
    {
        Ensurer.ensureNonBlank(path.toString(), "Path");

        try
        {
            mimeType = Files.probeContentType(path);
            return path.toString();
        } catch (IOException e)
        {
            e.printStackTrace();
            throw new IllegalArgumentException("Help");
        }


    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" + "Pfad: "+ path.toString()+ "\nMimeType: " + mimeType;
    }

}

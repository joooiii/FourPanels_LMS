package CasePackage;
import validation.Ensurer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MediaSection extends Section
{

    private String mimeType;

    public MediaSection(String mimeType, String title)
    {
        super(title);
        this.mimeType = addNewFile(mimeType);
    }

    public String addNewFile(String fileName)
    {
        Ensurer.ensureNonBlank(fileName, "File Name");
        Path path = new File(fileName).toPath();
        try
        {
            mimeType = Files.probeContentType(path);
            return mimeType;
        } catch (IOException e)
        {
            e.printStackTrace();
            return "file type not valid";
        }


    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" + mimeType;
    }

}

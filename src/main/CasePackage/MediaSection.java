package CasePackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MediaSection extends Section
{
    private String mimeType;

    public MediaSection(String mimeType)
    {
        super();
        this.mimeType = mimeType;
    }

    public String addNewFile(String fileName)
    {
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




}

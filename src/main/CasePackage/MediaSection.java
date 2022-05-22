package CasePackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MediaSection extends Section
{
    private String mimeTypes;

    public MediaSection(String mimeTypes)
    {
        super();
        this.mimeTypes = mimeTypes;
    }

    public String addNewFile(String fileName)
    {
        Path path = new File(fileName).toPath();
        try
        {
            String mimeType = Files.probeContentType(path);
            return mimeType;
        } catch (IOException e)
        {
            e.printStackTrace();
            return "file type not valid";
        }
    }




}

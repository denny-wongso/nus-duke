package Data;

import CustomException.UnsupportedTaskType;
import Tasks.TaskInterface;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * The interface for storing each saved file name
 */
public interface FileInterface {
    /**
     * Returns the arraylist of data File from a file
     * There will be at least 1 default file
     *
     * @return all the files
     */
    public ArrayList<FileInfo> getAllFile();

    /**
     * Set specific file to an active
     * if the file couldn't be found, nothing will be return
     *
     * @return void
     * @param alias the alias name of the file
     */
    public void setActive(String alias) throws IOException;
    /**
     * get current active file
     *
     * @return File the active file
     */
    public FileInfo getActiveFile() throws IOException;
    /**
     * to add a new custom file from user
     *
     * @return boolean true for add success and false fo add fail
     * @param alias the new alias
     */
    public boolean addNewFile(String alias) throws IOException;
}
/*
package data;

import java.io.File;
import java.nio.file.Files;


public class RekursiveFromDiriktory {
    */
/**
     * Tries to remove all files (and sub-directories optionally) in the designated
     * directory
     *
     * @param dir_path  directory path to clear from other files and optionally
     *                  directories
     * @param recursive deletes sub-dirs also if set to {@code true}
     * @return {@code true} if operation completed successfully that is no errors
     *         occurs during operation, else {@code false}
     *//*

    public static void main (String [] args){




    }





    public static boolean clearDirectory( String dir_path, boolean recursive )
    {
        File dir = new File( dir_path );
        if ( !dir.isDirectory() )
        {
            return false;
        }
        boolean res = true;
        String[] files = dir.list();
        String fdir = Files.resetDir( dir_path );
        String fpath;
        StringBuffer sb = new StringBuffer();
        for ( int i = 0; i < files.length; i++ )
        {
            sb.delete( 0, Integer.MAX_VALUE ).append( fdir ).append( files[ i ] );
            File file = new File( fpath = sb.toString() );
            if ( file.isDirectory() && recursive )
            {
                res = clearDirectory( fpath, recursive );
            }
            else
            {
                try
                {
                    res = file.delete();  // TODO: здесь забирать конкретное имя фала в общий выходной массив
                }
                catch ( SecurityException se )
                {
                }
            }
        }
        return res;
    }
}
*/

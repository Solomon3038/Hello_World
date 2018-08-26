package ParserExample;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





public class TextParser {








        private static int MAX_BUFF_SIZE;

        private static String regexp;

        private static boolean partFlag;

        private static String completeString;

        /**
         * This method load data from txt file into the buffer and use
         * java.util.regex.Matcher, and java.util.regex.Pattern for finding lexems
         *
         * @param breader -
         *            buffered reader
         * @throws IOException
         */
        public static void textParsing(BufferedReader breader) throws IOException {
            // compile regular expresion
            Pattern lexem = Pattern.compile(regexp);
            int bufferCount;
            // word - founded lexem
            String word = new String();
            // part of lexem
            String tmpString = new String();
            char[] charBuffer = new char[MAX_BUFF_SIZE];
            partFlag = false;
            // reads chars from file into the buffer
            // bufferCount - count of chars wich we had read
            while ((bufferCount = breader.read(charBuffer)) != -1) {
                // create new string
                String str = new String(charBuffer, 0, bufferCount);
                // use matcher for finding lexems
                Matcher mat = lexem.matcher(str);
                while (mat.find()) {
                    // find lexem
                    word = mat.group();
                    // if lexem < then our buffer and there is no lexem's part in
                    // buffer
                    if ((mat.end() < MAX_BUFF_SIZE) && !partFlag) {
                        // we founded lexem
                        completeString = mat.group();
                    } else {
                        // find secod part of the lexem
                        if ((mat.start() == 0) && partFlag
                                && (mat.end() != MAX_BUFF_SIZE)) {
                            completeString = tmpString + mat.group();
                            partFlag = false;
                        } else {
                            // if second part > then our buffer
                            if ((mat.start() == 0) && partFlag
                                    && (mat.end() == MAX_BUFF_SIZE)) {
                                String secondPart = new String(tmpString);
                                tmpString = secondPart + mat.group();
                                partFlag = true;
                            } else {
                                // if lexem > then our buffer
                                if ((mat.end() == MAX_BUFF_SIZE)) {
                                    // set flag
                                    partFlag = true;
                                    // store part of the string
                                    tmpString = word;
                                } else {
                                    completeString = tmpString;
                                    partFlag = false;
                                }
                            }

                        }
                    }
                    if (!partFlag) {
                        ParserUtil.AddWordToHashMap(completeString);
                    }
                }
            }
            breader.close();
        }

        public static void setMAX_BUFF_SIZE(int max_buff_size) {
            MAX_BUFF_SIZE = max_buff_size;
        }

        public static void setRegexp(String regexp) {
            TextParser.regexp = regexp;
        }
    }



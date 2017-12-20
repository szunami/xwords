import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class CrosswordBuilder {

    private Set<String> validWords;

    public CrosswordBuilder(Set<String> validWords) {
        this.validWords = validWords;
    }

    public static CrosswordBuilder fromPath(Path path) throws IOException {
        return new CrosswordBuilder(
                Files.lines(path)
                        .map(word -> word.split(";")[0])
                        .collect(Collectors.toSet()));
    }

    public List<Crossword> solveFromGrid(Crossword crossword) {

        

        return ImmutableList.of();
    }
}

package org.example.config;

import org.example.unicode.model.Unicode;
import org.example.unicode.repository.UnicodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    private final UnicodeRepository unicodeRepository;

    public InitData(UnicodeRepository unicodeRepository){
        this.unicodeRepository = unicodeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Set<Character> chars = Set.of('a', 'b', 'c', 'd', 'e');

        for (char ch : chars) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) ch);
            unicode.setBogstav(ch);
            unicode.setDescription("Description for " + ch);
            unicode.setName("Name for " + ch);

            unicodeRepository.save(unicode);
        }

    }
}

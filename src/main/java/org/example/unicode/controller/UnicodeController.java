package org.example.unicode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeController {

    @GetMapping("/unicode/{i}")
    public String getUnicode(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + "char=" + c;

    }

    @GetMapping("/char/{ch}")
    public String getUnicodeFromChar(@PathVariable char ch) {
        int unicode = (int) ch;
        return "char=" + ch + "unicode=" + unicode;

    }
    @GetMapping("unicodeSequence")
    public String getUnicodeSequence(@RequestParam char startChar, @RequestParam int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char currentChar = (char) (startChar + i);
            result.append("char=").append(currentChar).append("unicode=").append((int) currentChar).append("\n");
        }
        return result.toString();
        }
    }

package com.vladsch.flexmark.util.mappers;

import com.vladsch.flexmark.util.sequence.BasedSequence;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface SpecialLeadInHandler {
    /**
     * Escape special lead-in characters which start a block element if first non-whitespace on the line
     *
     * The leadIn sequence is always followed by a space or EOL so if lead in does not require a space to start a block element
     * then test if it starts with the special sequence, otherwise test if it equals the special sequence
     *
     * @param sequence  char sequence appearing as first non-whitespace on a line
     * @param consumer consumer of char sequences to be called for the leadIn if it is changed by this handler
     * @return true if sequence was a lead in for the handler
     */
    boolean escape(@NotNull BasedSequence sequence, @NotNull Consumer<CharSequence> consumer);

    /**
     * UnEscape special lead-in characters which start a block element if first non-whitespace on the line
     *
     * The leadIn sequence is always followed by a space or EOL so if lead in does not require a space to start a block element
     * then test if it starts with the special sequence, otherwise test if it equals the special sequence
     *
     * @param sequence  char sequence appearing as first non-whitespace on a line
     * @param consumer consumer of char sequences to be called for the leadIn if it is changed by this handler
     * @return true if sequence was a lead in for the handler
     */
    boolean unEscape(@NotNull BasedSequence sequence, @NotNull Consumer<CharSequence> consumer);
}

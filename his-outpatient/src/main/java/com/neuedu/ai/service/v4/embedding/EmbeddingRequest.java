package com.neuedu.ai.service.v4.embedding;

import lombok.*;

import java.util.List;

/**
 * Creates an embedding vector representing the input text.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmbeddingRequest {

    /**
     * The name of the model to use.
     * Required if using the new v1/embeddings endpoint.
     */
    String model;

    /**
     * Input text to get embeddings for, encoded as a string or array of tokens.
     * To get embeddings for multiple inputs in a single request, pass an array of strings or array of token arrays.
     * Each input must not exceed 2048 tokens in length.
     * <p>
     * Unless you are embedding code, we suggest replacing newlines (\n) in your input with a single space,
     * as we have observed inferior results when newlines are present.
     */

    String input;

    /**
     * A unique identifier representing your end-user, which will help ZhiPuAI to monitor and detect abuse.
     */
    String user;
}

package com.neuedu.ai.service.v4.fine_turning;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Hyperparameters for a fine-tuning job
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hyperparameters {

    /**
     * The number of epochs to train the model for.
     * An epoch refers to one full cycle through the training dataset.
     * "Auto" decides the optimal number of epochs based on the size of the dataset.
     * If setting the number manually, we support any number between 1 and 50 epochs.
     */
    @JsonProperty("n_epochs")
    Integer nEpochs;
}

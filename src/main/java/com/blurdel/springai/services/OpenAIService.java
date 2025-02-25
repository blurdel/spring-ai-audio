package com.blurdel.springai.services;


import com.blurdel.springai.model.Question;

public interface OpenAIService {

    byte[] getSpeech(Question question);

}

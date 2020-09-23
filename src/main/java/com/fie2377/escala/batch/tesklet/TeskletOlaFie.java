package com.fie2377.escala.batch.tesklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class TeskletOlaFie implements Tasklet {

	//@StepScope // para buscar a variável na aplicação
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Ola ");
		return RepeatStatus.FINISHED; // para dizer que a tarefa ira terminar
	}
}
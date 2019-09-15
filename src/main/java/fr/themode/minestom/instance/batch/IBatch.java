package fr.themode.minestom.instance.batch;

import fr.themode.minestom.Main;
import fr.themode.minestom.utils.thread.MinestomThread;

import java.util.concurrent.ExecutorService;

public interface IBatch {

    ExecutorService batchesPool = new MinestomThread(Main.THREAD_COUNT_BLOCK_BATCH, "Ms-BlockBatchPool");

}
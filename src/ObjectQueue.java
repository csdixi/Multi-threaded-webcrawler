import java.util.*;

/**
 * Simple "reference" implementation of the queue interface
 * In addition to the interface, an object "data" is supported
 * for carrying additional data over threads.
 * By default, the queue supports 4 levels and an unlimited
 * number of elements. The number of elements is unlimited when
 * set to -1. A limited number of elements and a different
 * number of levels can be specified in the appropriate constructors.
 *
 * This code is in the public domain.
 *
 * @author Andreas Hess <andreas.hess at ucd.ie>, 11/02/2003
 * 
 */
public class ObjectQueue implements Queue {
	
	Object data;
	Set gatheredElements;
	Set processedElements;
	LinkedList queues[];
	int mx;
	int nq;
	
	public synchronized void setData(Object o){
		data = o;
	}
	
	public synchronized Object getData(){
		return data;
	}
	
	public ObjectQueue(int _nq, int _mx){
		nq = _nq;
		mx = _mx;
		queues = new LinkedList[nq];
		for (int n = 0; n < nq; n++){
			queues[n] = new LinkedList();
		}
	}
	
	public ObjectQueue(int _nq) {
		nq = _nq;
		mx = -1;
		queues = new LinkedList[nq];
		for (int n = 0; n < nq; n++) {
			queues[n] = new LinkedList();
		}
	}

	public ObjectQueue() {
		nq = 4;
		mx = -1;
		queues = new LinkedList[nq];
		for (int n = 0; n < nq; n++) {
			queues[n] = new LinkedList();
		}
	}

	@Override
	public Set getGatheredElements() {
		return gatheredElements;
	}

	@Override
	public Set getProcessedElements() {
		return processedElements;
	}

	@Override
	public int getQueueSize(int level) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getProcessedSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGatheredSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxElements(int elements) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object pop(int level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean push(Object task, int level) {
		// TODO Auto-generated method stub
		return false;
	}

}

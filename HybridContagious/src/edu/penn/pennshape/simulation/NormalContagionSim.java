package edu.penn.pennshape.simulation;

public class NormalContagionSim extends NetworkSim {
	public static void main(String[] args) {

		NormalContagionSim ns = new NormalContagionSim();

		int threshold = 2;
		int numofcommunityseeds = 1;
		int numofmessageseeds = 1;
		int mean = 1;
		int variance = 1;
		ns.simNormalContigions(threshold, numofcommunityseeds,
				numofmessageseeds, mean, variance);

	}
}

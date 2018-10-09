class Parameters{
  /*
   * Class that holds all parameters of our Algorithm.
   * Consists of only public parameters.
   */

    // BASIC PROBLEM PARAMETERS (DO NOT CHANGE)
    public static final int individual_size = 10;
    public static final double values_min = -5.0;
    public static final double values_max =  5.0;
    // number of individuals of one population
    public static final int population_size = 100;


    // Parameters for the clustering
    public int elitist_size = 10;
    public int proletarian_size = 20;
    public double cluster_distance_thresh = 2.0;


    // Parameters for the EA-components
    public int offspring_size = 100;  //TODO: Should that be more/less ?

    // (1) Parameters for parent selection
    public int parent_tournament_size = 5;

    // (2) Parameters for mutation
    public double uniform_mutation_prop = 0.05;

    // (3) Parameters for survivor selection
    public int survivor_tournament_size = 10;

}
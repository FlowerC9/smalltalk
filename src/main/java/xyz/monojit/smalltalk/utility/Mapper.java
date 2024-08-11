package xyz.monojit.smalltalk.utility;

public interface Mapper<S, T> {

  T transform(S source);

  S transformBack(T source);
}

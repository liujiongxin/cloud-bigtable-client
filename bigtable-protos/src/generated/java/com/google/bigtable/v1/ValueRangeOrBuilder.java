// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1approved/bigtable_data.proto

package com.google.bigtable.v1;

public interface ValueRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.ValueRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes start_value_inclusive = 1;</code>
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartValueInclusive();

  /**
   * <code>optional bytes start_value_exclusive = 2;</code>
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartValueExclusive();

  /**
   * <code>optional bytes end_value_inclusive = 3;</code>
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndValueInclusive();

  /**
   * <code>optional bytes end_value_exclusive = 4;</code>
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndValueExclusive();
}

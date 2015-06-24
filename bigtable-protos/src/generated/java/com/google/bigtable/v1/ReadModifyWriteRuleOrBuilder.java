// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1approved/bigtable_data.proto

package com.google.bigtable.v1;

public interface ReadModifyWriteRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.ReadModifyWriteRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string family_name = 1;</code>
   *
   * <pre>
   * The name of the family to which the read/modify/write should be applied.
   * Must match [-_.a-zA-Z0-9]+
   * </pre>
   */
  java.lang.String getFamilyName();
  /**
   * <code>optional string family_name = 1;</code>
   *
   * <pre>
   * The name of the family to which the read/modify/write should be applied.
   * Must match [-_.a-zA-Z0-9]+
   * </pre>
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();

  /**
   * <code>optional bytes column_qualifier = 2;</code>
   *
   * <pre>
   * The qualifier of the column to which the read/modify/write should be
   * applied.
   * Can be any byte string, including the empty string.
   * </pre>
   */
  com.google.protobuf.ByteString getColumnQualifier();

  /**
   * <code>optional bytes append_value = 3;</code>
   *
   * <pre>
   * Rule specifying that "append_value" be appended to the existing value.
   * If the targeted cell is unset, it will be treated as containing the
   * empty string.
   * </pre>
   */
  com.google.protobuf.ByteString getAppendValue();

  /**
   * <code>optional int64 increment_amount = 4;</code>
   *
   * <pre>
   * Rule specifying that "increment_amount" be added to the existing value.
   * If the targeted cell is unset, it will be treated as containing a zero.
   * Otherwise, the targeted cell must contain an 8-byte value (interpreted
   * as a 64-bit big-endian signed integer), or the entire request will fail.
   * </pre>
   */
  long getIncrementAmount();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.chalabi.EtudeDeCas.stubs;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.chalabi.EtudeDeCas.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.com.chalabi.EtudeDeCas.Client client = 2;</code>
   * @return Whether the client field is set.
   */
  boolean hasClient();
  /**
   * <code>.com.chalabi.EtudeDeCas.Client client = 2;</code>
   * @return The client.
   */
  com.chalabi.EtudeDeCas.stubs.Client getClient();
  /**
   * <code>.com.chalabi.EtudeDeCas.Client client = 2;</code>
   */
  com.chalabi.EtudeDeCas.stubs.ClientOrBuilder getClientOrBuilder();

  /**
   * <code>.com.chalabi.EtudeDeCas.Chambre chambre = 3;</code>
   * @return Whether the chambre field is set.
   */
  boolean hasChambre();
  /**
   * <code>.com.chalabi.EtudeDeCas.Chambre chambre = 3;</code>
   * @return The chambre.
   */
  com.chalabi.EtudeDeCas.stubs.Chambre getChambre();
  /**
   * <code>.com.chalabi.EtudeDeCas.Chambre chambre = 3;</code>
   */
  com.chalabi.EtudeDeCas.stubs.ChambreOrBuilder getChambreOrBuilder();

  /**
   * <code>string dateDebut = 4;</code>
   * @return The dateDebut.
   */
  java.lang.String getDateDebut();
  /**
   * <code>string dateDebut = 4;</code>
   * @return The bytes for dateDebut.
   */
  com.google.protobuf.ByteString
      getDateDebutBytes();

  /**
   * <code>string dateFin = 5;</code>
   * @return The dateFin.
   */
  java.lang.String getDateFin();
  /**
   * <code>string dateFin = 5;</code>
   * @return The bytes for dateFin.
   */
  com.google.protobuf.ByteString
      getDateFinBytes();

  /**
   * <code>string preferences = 6;</code>
   * @return The preferences.
   */
  java.lang.String getPreferences();
  /**
   * <code>string preferences = 6;</code>
   * @return The bytes for preferences.
   */
  com.google.protobuf.ByteString
      getPreferencesBytes();
}

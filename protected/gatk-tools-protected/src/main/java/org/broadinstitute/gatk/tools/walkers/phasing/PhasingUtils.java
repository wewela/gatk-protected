/*
* By downloading the PROGRAM you agree to the following terms of use:
* 
* BROAD INSTITUTE
* SOFTWARE LICENSE AGREEMENT
* FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
* 
* This Agreement is made between the Broad Institute, Inc. with a principal address at 415 Main Street, Cambridge, MA 02142 (“BROAD”) and the LICENSEE and is effective at the date the downloading is completed (“EFFECTIVE DATE”).
* 
* WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
* WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
* NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
* 
* 1. DEFINITIONS
* 1.1 PROGRAM shall mean copyright in the object code and source code known as GATK3 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute.org/gatk on the EFFECTIVE DATE.
* 
* 2. LICENSE
* 2.1 Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. LICENSEE hereby automatically grants to BROAD a non-exclusive, royalty-free, irrevocable license to any LICENSEE bug fixes or modifications to the PROGRAM with unlimited rights to sublicense and/or distribute.  LICENSEE agrees to provide any such modifications and bug fixes to BROAD promptly upon their creation.
* The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only. For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
* 2.2 No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD. LICENSEE shall ensure that all of its users agree to the terms of this Agreement. LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
* 2.3 License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.
* 
* 3. PHONE-HOME FEATURE
* LICENSEE expressly acknowledges that the PROGRAM contains an embedded automatic reporting system (“PHONE-HOME”) which is enabled by default upon download. Unless LICENSEE requests disablement of PHONE-HOME, LICENSEE agrees that BROAD may collect limited information transmitted by PHONE-HOME regarding LICENSEE and its use of the PROGRAM.  Such information shall include LICENSEE’S user identification, version number of the PROGRAM and tools being run, mode of analysis employed, and any error reports generated during run-time.  Collection of such information is used by BROAD solely to monitor usage rates, fulfill reporting requirements to BROAD funding agencies, drive improvements to the PROGRAM, and facilitate adjustments to PROGRAM-related documentation.
* 
* 4. OWNERSHIP OF INTELLECTUAL PROPERTY
* LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies. LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
* Copyright 2012-2014 Broad Institute, Inc.
* Notice of attribution: The GATK3 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
* LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
* 
* 5. INDEMNIFICATION
* LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
* 
* 6. NO REPRESENTATIONS OR WARRANTIES
* THE PROGRAM IS DELIVERED AS IS. BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
* IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
* 
* 7. ASSIGNMENT
* This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
* 
* 8. MISCELLANEOUS
* 8.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
* 8.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
* 8.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
* 8.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested. All notices under this Agreement shall be deemed effective upon receipt.
* 8.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter.
* 8.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
* 8.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.gatk.tools.walkers.phasing;

import htsjdk.samtools.reference.ReferenceSequenceFile;
import htsjdk.samtools.util.StringUtil;
import org.broadinstitute.gatk.utils.GenomeLoc;
import org.broadinstitute.gatk.utils.GenomeLocParser;
import org.broadinstitute.gatk.utils.Utils;
import org.broadinstitute.gatk.utils.variant.GATKVariantContextUtils;
import htsjdk.variant.vcf.VCFConstants;
import org.broadinstitute.gatk.utils.exceptions.ReviewedGATKException;
import htsjdk.variant.variantcontext.*;

import java.util.*;

/**
 * [Short one sentence description of this walker]
 * <p/>
 * <p>
 * [Functionality of this walker]
 * </p>
 * <p/>
 * <h3>Input</h3>
 * <p>
 * [Input description]
 * </p>
 * <p/>
 * <h3>Output</h3>
 * <p>
 * [Output description]
 * </p>
 * <p/>
 * <h3>Examples</h3>
 * <pre>
 *    java
 *      -jar GenomeAnalysisTK.jar
 *      -T $WalkerName
 *  </pre>
 *
 * @author Your Name
 * @since Date created
 */
class PhasingUtils {
    static VariantContext mergeIntoMNP(GenomeLocParser genomeLocParser, VariantContext vc1, VariantContext vc2, ReferenceSequenceFile referenceFile, AlleleMergeRule alleleMergeRule) {
        if (!mergeIntoMNPvalidationCheck(genomeLocParser, vc1, vc2))
            return null;

        // Check that it's logically possible to merge the VCs:
        if (!allSamplesAreMergeable(vc1, vc2))
            return null;

        // Check if there's a "point" in merging the VCs (e.g., annotations could be changed)
        if (!alleleMergeRule.allelesShouldBeMerged(vc1, vc2))
            return null;

        return reallyMergeIntoMNP(vc1, vc2, referenceFile);
    }

    // Assumes: alleleSegregationIsKnown(gt1, gt2)
    static SameHaplotypeAlleles matchHaplotypeAlleles(final Genotype gt1, final Genotype gt2) {
        final SameHaplotypeAlleles hapAlleles = new SameHaplotypeAlleles();

        final int nalleles = gt1.getPloidy();
        final Allele[] site1AllelesArray = gt1.getAlleles().toArray(new Allele[nalleles]);
        final Allele[] site2AllelesArray = gt2.getAlleles().toArray(new Allele[nalleles]);

        final int[] site2Inds = new int[nalleles];
        if (gt1.hasAnyAttribute(ReadBackedPhasing.HP_KEY) && gt2.hasAnyAttribute(ReadBackedPhasing.HP_KEY)) {
            final String[] hp1 = (String[]) gt1.getAnyAttribute(ReadBackedPhasing.HP_KEY);
            final String[] hp2 = (String[]) gt2.getAnyAttribute(ReadBackedPhasing.HP_KEY);

            final HashMap<String, Integer> site1Inds = new HashMap<String, Integer>();
            for (int ind1 = 0; ind1 < hp1.length; ++ind1) {
                final String h1 = hp1[ind1];
                site1Inds.put(h1, ind1);
            }

            for (int ind2 = 0; ind2 < hp2.length; ++ind2) {
                final String h2 = hp2[ind2];
                final int ind1 = site1Inds.get(h2);
                if (ind2 != ind1)
                    hapAlleles.requiresSwap = true;
                site2Inds[ind2] = ind1; // this is OK, since allSamplesAreMergeable()
            }
        }
        else { // gt1.isHom() || gt2.isHom() ; so, we trivially merge the corresponding alleles
            for (int ind = 0; ind < site2Inds.length; ++ind)
                site2Inds[ind] = ind;
        }

        for (int ind1 = 0; ind1 < nalleles; ++ind1) {
            final Allele all1 = site1AllelesArray[ind1];
            final int ind2 = site2Inds[ind1];
            final Allele all2 = site2AllelesArray[ind2]; // this is OK, since alleleSegregationIsKnown(gt1, gt2)

            hapAlleles.hapAlleles.add(new AlleleOneAndTwo(all1, all2));
        }

        return hapAlleles;
    }

    static VariantContext reallyMergeIntoMNP(VariantContext vc1, VariantContext vc2, ReferenceSequenceFile referenceFile) {
        final int startInter = vc1.getEnd() + 1;
        final int endInter = vc2.getStart() - 1;
        byte[] intermediateBases = null;
        if (startInter <= endInter) {
            intermediateBases = referenceFile.getSubsequenceAt(vc1.getChr(), startInter, endInter).getBases();
            StringUtil.toUpperCase(intermediateBases);
        }
        final MergedAllelesData mergeData = new MergedAllelesData(intermediateBases, vc1, vc2); // ensures that the reference allele is added

        final GenotypesContext mergedGenotypes = GenotypesContext.create();
        for (final Genotype gt1 : vc1.getGenotypes()) {
            final Genotype gt2 = vc2.getGenotype(gt1.getSampleName());

            final SameHaplotypeAlleles hapAlleles = matchHaplotypeAlleles(gt1, gt2);

            boolean isPhased = gt1.isPhased() && gt2.isPhased();
            if (hapAlleles.requiresSwap) // at least one swap of allele order was necessary, so trio-based phasing order cannot be maintained
                isPhased = false;

            final List<Allele> mergedAllelesForSample = new LinkedList<Allele>();
            for (AlleleOneAndTwo all1all2 : hapAlleles.hapAlleles) {
                final Allele mergedAllele = mergeData.ensureMergedAllele(all1all2.all1, all1all2.all2);
                mergedAllelesForSample.add(mergedAllele);
            }

            final double mergedGQ = Math.min(gt1.getLog10PError(), gt2.getLog10PError());

            final Map<String, Object> mergedGtAttribs = new HashMap<String, Object>();

            double PQ = Double.MAX_VALUE;
            if (gt1.hasAnyAttribute(ReadBackedPhasing.PQ_KEY)) {
                PQ = Math.min(PQ, (double) gt1.getAnyAttribute(ReadBackedPhasing.PQ_KEY));
            }
            if (gt2.hasAnyAttribute(ReadBackedPhasing.PQ_KEY)) {
                PQ = Math.min(PQ, (double) gt2.getAnyAttribute(ReadBackedPhasing.PQ_KEY));
            }
            if (PQ != Double.MAX_VALUE)
                mergedGtAttribs.put(ReadBackedPhasing.PQ_KEY, PQ);

            if (gt1.hasAnyAttribute(ReadBackedPhasing.HP_KEY)) {
                mergedGtAttribs.put(ReadBackedPhasing.HP_KEY, gt1.getAnyAttribute(ReadBackedPhasing.HP_KEY));
            }
            else if (gt2.hasAnyAttribute(ReadBackedPhasing.HP_KEY)) { // gt1 doesn't have, but merged (so gt1 is hom and can take gt2's haplotype names):
                mergedGtAttribs.put(ReadBackedPhasing.HP_KEY, gt2.getAnyAttribute(ReadBackedPhasing.HP_KEY));
            }

            final Genotype mergedGt = new GenotypeBuilder(gt1.getSampleName(), mergedAllelesForSample).log10PError(mergedGQ).attributes(mergedGtAttribs).phased(isPhased).make();
            mergedGenotypes.add(mergedGt);
        }

        final String mergedName = mergeVariantContextNames(vc1.getSource(), vc2.getSource());
        final double mergedLog10PError = Math.min(vc1.getLog10PError(), vc2.getLog10PError());
        final Set<String> mergedFilters = new HashSet<String>(); // Since vc1 and vc2 were unfiltered, the merged record remains unfiltered
        final Map<String, Object> mergedAttribs = mergeVariantContextAttributes(vc1, vc2);

        // ids
        final List<String> mergedIDs = new ArrayList<String>();
        if ( vc1.hasID() ) mergedIDs.add(vc1.getID());
        if ( vc2.hasID() ) mergedIDs.add(vc2.getID());
        final String mergedID = mergedIDs.isEmpty() ? VCFConstants.EMPTY_ID_FIELD : Utils.join(VCFConstants.ID_FIELD_SEPARATOR, mergedIDs);

        final VariantContextBuilder mergedBuilder = new VariantContextBuilder(mergedName, vc1.getChr(), vc1.getStart(), vc2.getEnd(), mergeData.getAllMergedAlleles()).id(mergedID).genotypes(mergedGenotypes).log10PError(mergedLog10PError).filters(mergedFilters).attributes(mergedAttribs);
        VariantContextUtils.calculateChromosomeCounts(mergedBuilder, true);
        return mergedBuilder.make();
    }

    static String mergeVariantContextNames(String name1, String name2) {
        return name1 + "_" + name2;
    }

    static Map<String, Object> mergeVariantContextAttributes(VariantContext vc1, VariantContext vc2) {
        Map<String, Object> mergedAttribs = new HashMap<String, Object>();

        final List<VariantContext> vcList = new LinkedList<VariantContext>();
        vcList.add(vc1);
        vcList.add(vc2);

        //String[] MERGE_OR_ATTRIBS = {VCFConstants.DBSNP_KEY};
        final String[] MERGE_OR_ATTRIBS = {};
        for (String orAttrib : MERGE_OR_ATTRIBS) {
            boolean attribVal = false;
            for (VariantContext vc : vcList) {
                attribVal = vc.getAttributeAsBoolean(orAttrib, false);
                if (attribVal) // already true, so no reason to continue:
                    break;
            }
            mergedAttribs.put(orAttrib, attribVal);
        }

        return mergedAttribs;
    }

    static boolean mergeIntoMNPvalidationCheck(GenomeLocParser genomeLocParser, VariantContext vc1, VariantContext vc2) {
        if (!vc1.isSNP() || !vc2.isSNP())
            return false;

        final GenomeLoc loc1 = GATKVariantContextUtils.getLocation(genomeLocParser, vc1);
        final GenomeLoc loc2 = GATKVariantContextUtils.getLocation(genomeLocParser, vc2);

        if (!loc1.onSameContig(loc2))
            return false;

        if (!loc1.isBefore(loc2))
            return false;

        if (vc1.isFiltered() || vc2.isFiltered())
            return false;

        if (!vc1.getSampleNames().equals(vc2.getSampleNames())) // vc1, vc2 refer to different sample sets
            return false;

        if (!allGenotypesAreUnfilteredAndCalled(vc1) || !allGenotypesAreUnfilteredAndCalled(vc2))
            return false;

        return true;
    }

    static boolean allGenotypesAreUnfilteredAndCalled(VariantContext vc) {
        for (final Genotype gt : vc.getGenotypes()) {
            if (gt.isNoCall() || gt.isFiltered())
                return false;
        }

        return true;
    }

    static boolean allSamplesAreMergeable(VariantContext vc1, VariantContext vc2) {
        // Check that each sample's genotype in vc2 is uniquely appendable onto its genotype in vc1:
        for (final Genotype gt1 : vc1.getGenotypes()) {
            final Genotype gt2 = vc2.getGenotype(gt1.getSampleName());

            if (!alleleSegregationIsKnown(gt1, gt2)) // can merge if: phased, or if either is a hom
                return false;
        }

        return true;
    }

    static boolean alleleSegregationIsKnown(Genotype gt1, Genotype gt2) {
        if (gt1.getPloidy() != gt2.getPloidy())
            return false;

        // If gt1 or gt2 are hom, then could be MERGED:
        if (gt1.isHom() || gt2.isHom())
            return true;

        // Otherwise, need to check that alleles from gt1 can be matched up with alleles from gt2:
        if (!gt1.hasAnyAttribute(ReadBackedPhasing.HP_KEY) || !gt2.hasAnyAttribute(ReadBackedPhasing.HP_KEY))
            return false;

        final String[] hp1 = (String[]) gt1.getAnyAttribute(ReadBackedPhasing.HP_KEY);
        final String[] hp2 = (String[]) gt2.getAnyAttribute(ReadBackedPhasing.HP_KEY);
        if (hp1.length != gt1.getPloidy() || hp2.length != gt2.getPloidy())
            return false;

        Arrays.sort(hp1);
        Arrays.sort(hp2);
        return (Arrays.equals(hp1, hp2)); // The haplotype names match (though possibly in a different order)
    }

    static boolean someSampleHasDoubleNonReferenceAllele(VariantContext vc1, VariantContext vc2) {
        for (final Genotype gt1 : vc1.getGenotypes()) {
            final Genotype gt2 = vc2.getGenotype(gt1.getSampleName());

            final SameHaplotypeAlleles hapAlleles = matchHaplotypeAlleles(gt1, gt2);
            for (AlleleOneAndTwo all1all2 : hapAlleles.hapAlleles) {
                if (all1all2.all1.isNonReference() && all1all2.all2.isNonReference()) // corresponding alleles are alternate
                    return true;
            }
        }

        return false;
    }

    static boolean doubleAllelesSegregatePerfectlyAmongSamples(VariantContext vc1, VariantContext vc2) {
        // Check that Alleles at vc1 and at vc2 always segregate together in all samples (including reference):
        final Map<Allele, Allele> allele1ToAllele2 = new HashMap<Allele, Allele>();
        final Map<Allele, Allele> allele2ToAllele1 = new HashMap<Allele, Allele>();

        // Note the segregation of the alleles for the reference genome:
        allele1ToAllele2.put(vc1.getReference(), vc2.getReference());
        allele2ToAllele1.put(vc2.getReference(), vc1.getReference());

        // Note the segregation of the alleles for each sample (and check that it is consistent with the reference and all previous samples).
        for (final Genotype gt1 : vc1.getGenotypes()) {
            final Genotype gt2 = vc2.getGenotype(gt1.getSampleName());

            SameHaplotypeAlleles hapAlleles = matchHaplotypeAlleles(gt1, gt2);
            for (AlleleOneAndTwo all1all2 : hapAlleles.hapAlleles) {
                final Allele all1 = all1all2.all1;
                final Allele all2 = all1all2.all2;

                final Allele all1To2 = allele1ToAllele2.get(all1);
                if (all1To2 == null)
                    allele1ToAllele2.put(all1, all2);
                else if (!all1To2.equals(all2)) // all1 segregates with two different alleles at site 2
                    return false;

                final Allele all2To1 = allele2ToAllele1.get(all2);
                if (all2To1 == null)
                    allele2ToAllele1.put(all2, all1);
                else if (!all2To1.equals(all1)) // all2 segregates with two different alleles at site 1
                    return false;
            }
        }

        return true;
    }

    abstract static class AlleleMergeRule {
        // vc1, vc2 are ONLY passed to allelesShouldBeMerged() if mergeIntoMNPvalidationCheck(genomeLocParser, vc1, vc2) AND allSamplesAreMergeable(vc1, vc2):
        abstract public boolean allelesShouldBeMerged(VariantContext vc1, VariantContext vc2);

        public String toString() {
            return "all samples are mergeable";
        }
    }

    static class SameHaplotypeAlleles {
        public boolean requiresSwap;
        public List<AlleleOneAndTwo> hapAlleles;

        public SameHaplotypeAlleles() {
            requiresSwap = false;
            hapAlleles = new LinkedList<AlleleOneAndTwo>();
        }
    }

    static class AlleleOneAndTwo {
        private Allele all1;
        private Allele all2;

        public AlleleOneAndTwo(Allele all1, Allele all2) {
            this.all1 = all1;
            this.all2 = all2;
        }

        public int hashCode() {
            return all1.hashCode() + all2.hashCode();
        }

        public boolean equals(Object other) {
            if (!(other instanceof AlleleOneAndTwo))
                return false;

            final AlleleOneAndTwo otherAot = (AlleleOneAndTwo) other;
            return (this.all1.equals(otherAot.all1) && this.all2.equals(otherAot.all2));
        }
    }

    static class MergedAllelesData {
        private Map<AlleleOneAndTwo, Allele> mergedAlleles;
        private byte[] intermediateBases;
        private int intermediateLength;

        public MergedAllelesData(byte[] intermediateBases, VariantContext vc1, VariantContext vc2) {
            this.mergedAlleles = new HashMap<AlleleOneAndTwo, Allele>(); // implemented equals() and hashCode() for AlleleOneAndTwo
            this.intermediateBases = intermediateBases;
            this.intermediateLength = this.intermediateBases != null ? this.intermediateBases.length : 0;

            this.ensureMergedAllele(vc1.getReference(), vc2.getReference(), true);
        }

        public Allele ensureMergedAllele(Allele all1, Allele all2) {
            return ensureMergedAllele(all1, all2, false); // false <-> since even if all1+all2 = reference, it was already created in the constructor
        }

        private Allele ensureMergedAllele(Allele all1, Allele all2, boolean creatingReferenceForFirstTime) {
            AlleleOneAndTwo all12 = new AlleleOneAndTwo(all1, all2);
            Allele mergedAllele = mergedAlleles.get(all12);

            if (mergedAllele == null) {
                final byte[] bases1 = all1.getBases();
                final byte[] bases2 = all2.getBases();

                final byte[] mergedBases = new byte[bases1.length + intermediateLength + bases2.length];
                System.arraycopy(bases1, 0, mergedBases, 0, bases1.length);
                if (intermediateBases != null)
                    System.arraycopy(intermediateBases, 0, mergedBases, bases1.length, intermediateLength);
                System.arraycopy(bases2, 0, mergedBases, bases1.length + intermediateLength, bases2.length);

                mergedAllele = Allele.create(mergedBases, creatingReferenceForFirstTime);
                mergedAlleles.put(all12, mergedAllele);
            }

            return mergedAllele;
        }

        public Set<Allele> getAllMergedAlleles() {
            return new HashSet<Allele>(mergedAlleles.values());
        }
    }
}
